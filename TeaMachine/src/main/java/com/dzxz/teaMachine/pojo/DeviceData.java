package com.dzxz.teaMachine.pojo;

import com.dzxz.common.base.BaseEntity;

import java.util.Date;

public class DeviceData extends BaseEntity {

    // 设备数据列表编号
    private int id;
    // 设备id
    private String deviceId;
    // 设备名称
    private String deviceName;
    // 当前设备湿度
    private String currentHumidity;
    // 当前设备温度
    private String currentTemperature;
    // 数据创建时间
    private Date createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getCurrentHumidity() {
        return currentHumidity;
    }

    public void setCurrentHumidity(String currentHumidity) {
        this.currentHumidity = currentHumidity;
    }

    public String getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(String currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "DeviceData{" +
                "id=" + id +
                ", deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", currentHumidity='" + currentHumidity + '\'' +
                ", currentTemperature='" + currentTemperature + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
