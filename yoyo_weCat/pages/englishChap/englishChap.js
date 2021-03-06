
var app = getApp();
Page({
  data: {
    LIST: [],
    choose: "",
    sectionType: "",
    value:[0]
  },
  bindChange: function (e) {
    var that = this;
    const val = e.detail.value
    that.setData({
      choose: that.data.LIST[val].CHAP_NAME,
      sectionType: that.data.LIST[val].ID,
      value: val
    });
    wx.setStorageSync(that.data.key, that.data);
  },
  onLoad: function (options) {
    var that = this;
    var classId = options.classId;
    that.setData({
      key: classId+"-YYZJ-"+"key"
    });
    /*获取缓存*/
    wx.getStorage({
      key: that.data.key,
      success: function (res) {
        wx.hideLoading();
        that.setData(res.data);
      },
      fail: function () {
        wx.request({
          url: app.globalData.hostUrl + '/admin.do?method=getAllEnglishChapDataByClassId',
          data: {
            classId: classId
          },
          success: function (res) {
            if (res.data.LIST <= 0) {
              wx.showModal({
                title: '提示',
                content: '该课程暂无章节目录！',
                success: function () {
                  wx.navigateBack({
                    delta: 1
                  })
                }
              })
            } else {
              that.setData({
                LIST: res.data.LIST,
                choose: res.data.LIST[0].CHAP_NAME,
                sectionType: res.data.LIST[0].ID,
                value: [0]
              })
            }
          }
        })
      }
    })
  },
  clearSession: function () {
    var that = this;
    var questionKey = that.data.sectionType+ "-ZJ-" + "key";
    wx.showModal({
      title: '提示',
      content: '清除此章节缓存后，再次进入将不会继续上一次章节测试',
      success: function (res) {
        if (res.confirm) {
          wx.removeStorageSync(questionKey);
          wx.removeStorage({
            key: that.data.key,
            success: function (res) {
              wx.showToast({
                title: '清除成功'
              })
            }
          })
        }
      }
    })
  },
})