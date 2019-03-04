package com.demo.entity.wechat;

public class CheckDto {

    //  token: 第三方平台申请时填写的接收消息的校验token
    //  encodingAesKey: 第三方平台申请时填写的接收消息的加密symmetric_key
    //  appId: 公众号第三方平台的appidWXBizMsgCrypt(const std::string &sToken,
    private String appId;
    private String encodingAesKey;
    private String token;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getEncodingAesKey() {
        return encodingAesKey;
    }

    public void setEncodingAesKey(String encodingAesKey) {
        this.encodingAesKey = encodingAesKey;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "CheckDto{" +
                "appId='" + appId + '\'' +
                ", encodingAesKey='" + encodingAesKey + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
