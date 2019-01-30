package com.jsj.member.ob.dto.mini;

import org.hibernate.validator.constraints.NotBlank;


/**
 * @author ljy
 * @create 2018-11-21
 * @desc 微信用户基本信息
 */
public class MiniWechatDto {
    /**
     * 微信openID，解密后的数据
     */
    private String openId;

    /**
     * 微信unionID，解密后的数据
     */
    private String unionId;

    /**
     * 解密后的一些敏感数据
     */
    private WxWatermark watermark;

    /**
     * 用户昵称
     */
    @NotBlank(message = "用户昵称不能为空")
    private String nickName;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 用户性别
     * 0 未知 1 男性  2 女性
     */
    private int gender;

    /**
     * 用户所在国家
     */
    private String country;

    /**
     * 用户所在省份
     */
    private String province;

    /**
     * 用户所在城市
     */
    private String city;

    /**
     * 显示 country，province，city 所用的语言
     * en 英文 zh_CN 简体中文 zh_TW 繁体中文
     */
    private String language;

    /**
     * 手机号区号
     */
    private String countryCode;

    /**
     * 电话号码
     */
    private String phone;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public WxWatermark getWatermark() {
        return watermark;
    }

    public void setWatermark(WxWatermark watermark) {
        this.watermark = watermark;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
