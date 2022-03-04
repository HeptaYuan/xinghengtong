package com.dzxz.teaMachine.pojo;

import com.dzxz.common.base.BaseEntity;

public class DeviceInfo extends BaseEntity {
    // 设备id
    private String id;
    // 用户id
    private String userId;
    // 设备名称
    private String deviceName;
    // 设备key
    private String accessKeyId;
    // 设备密钥
    private String accessKeySecret;
    // 设备状态
    private int state;
    // 地区区域
    private String regionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", accessKeyId='" + accessKeyId + '\'' +
                ", accessKeySecret='" + accessKeySecret + '\'' +
                ", state=" + state +
                ", regionId='" + regionId + '\'' +
                '}';
    }
}
