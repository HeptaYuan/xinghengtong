package com.dzxz.teaMachine.service;


import com.aliyun.iot20180120.Client;
import com.aliyun.iot20180120.models.QueryDeviceRequest;
import com.aliyun.iot20180120.models.QueryDeviceResponse;
import com.aliyun.iot20180120.models.QueryProductListRequest;
import com.aliyun.teaopenapi.models.Config;
import com.dzxz.common.response.QueryResponseResult;
import com.dzxz.teaMachine.pojo.DeviceInfo;
import org.springframework.stereotype.Service;

@Service
public class DeviceInfoService {

    public QueryResponseResult<DeviceInfo> findDeviceInfoList(DeviceInfo deviceInfo) {
        // 初始化aliClient
        try {
            Client client = initClient(deviceInfo.getAccessKeyId(), deviceInfo.getAccessKeySecret(), deviceInfo.getRegionId());
            QueryDeviceRequest queryDeviceRequest = new QueryDeviceRequest();
            QueryDeviceResponse queryDeviceResponse = client.queryDevice(queryDeviceRequest);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Client initClient(String accessKeyId, String accessKeySecret, String regionId) throws Exception {

            Config config = new Config();
            config.accessKeyId = accessKeyId;
            config.accessKeySecret = accessKeySecret;
            config.regionId = regionId;

            Client client = new Client(config);
            return client;
    }

}
