if (typeof shareConfig == "undefined") {
    var url = location.protocol + "//" + location.host + ob.virtualPath;
    shareConfig = {
        title: "空铁管家",
        desc: "服务覆盖全国100个城市，300万商旅人士的出行首选！",
        link: url,
        imgUrl: "http://img.jsjinfo.cn/3b43f3ee6d6e7309515811cfab50cd68"
    };
}

//兼容小程序分享
// if (typeof wx != "undefined" && typeof wx.miniProgram != "undefined") {
//     // wx.miniProgram.navigateBack({delta: 1});
//     // wx.miniProgram.postMessage({data: '获取成功'});
//     wx.miniProgram.postMessage({
//         data: {
//             link: shareConfig.link,
//             title: shareConfig.title,
//             desc: shareConfig.desc,
//             imgUrl: shareConfig.imgUrl
//         }
//     });
// }

wx.ready(function () {

    var url = location.protocol + "//" + location.host;
    if (shareConfig.link) {
        if (shareConfig.link.indexOf(location.host) == -1) {
            shareConfig.link = url + shareConfig.link;
        }
    } else {
        shareConfig.link = url + ob.virtualPath;
    }

    shareConfig.desc = shareConfig.desc || "服务覆盖全国100个城市，300万商旅人士的出行首选！";
    shareConfig.title = shareConfig.title || "空铁管家";
    shareConfig.imgUrl = shareConfig.imgUrl || "http://img.jsjinfo.cn/3b43f3ee6d6e7309515811cfab50cd68";

    console.log(shareConfig);

    if(ob.mini){

        //TODO
        wx.miniProgram.postMessage({
            data: {
                link: "/pages/obbrowser/index?url="+encodeURIComponent(shareConfig.link),
                // link: "/pages/strictSelection/index?url="+encodeURIComponent("https://h5.ktgj.com/ob/exchange"),
                title: shareConfig.title,
                desc: shareConfig.desc,
                imgUrl: shareConfig.imgUrl
            }
        });

        return;
    }

    wx.onMenuShareAppMessage({
        title: shareConfig.title, // 分享标题
        desc: shareConfig.desc, // 分享描述
        link: shareConfig.link, // 分享链接
        imgUrl: shareConfig.imgUrl, // 分享图标
        type: '', // 分享类型,music、video或link，不填默认为link
        dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
        success: function (resp) {
            // 用户确认分享后执行的回调函数
            if (typeof shareSuccess != "undefined") {
                shareSuccess();
            }
        }
    });


    wx.onMenuShareTimeline({
        title: shareConfig.title, // 分享标题
        link: shareConfig.link, // 分享链接
        imgUrl: shareConfig.imgUrl, // 分享图标
        success: function (resp) {
            // 用户确认分享后执行的回调函数
            if (typeof shareSuccess != "undefined") {
                shareSuccess();
            }
        }
    });


    if (typeof wx.updateAppMessageShareData != "undefined") {
        wx.updateAppMessageShareData({
            title: shareConfig.title, // 分享标题
            desc: shareConfig.desc, // 分享描述
            link: shareConfig.link, // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
            imgUrl: shareConfig.imgUrl, // 分享图标
            success: function () {
                // 设置成功
            }
        });
    }

    if (typeof wx.updateTimelineShareData != "undefined") {
        wx.updateTimelineShareData({
            title: shareConfig.title, // 分享标题
            link: shareConfig.link, // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
            imgUrl: shareConfig.imgUrl, // 分享图标
            success: function () {
                // 设置成功
            }
        });
    }

});