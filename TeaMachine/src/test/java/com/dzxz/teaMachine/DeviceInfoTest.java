package com.dzxz.teaMachine;

import com.aliyun.iot20180120.Client;
import com.aliyun.iot20180120.models.*;
import com.aliyun.teaopenapi.models.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DeviceInfoTest {


    @Test
    public void testFindDeviceList() throws Exception {

        Config config = new Config();
//        config.accessKeyId = "LTAI5tA7o1d2hHZDrC214e4E";
        config.accessKeyId = "LTAI4FoGfoX7h2qmUutzeqpm";
//        config.accessKeySecret = "VjpbRSrZP17ODNzErRWZbcZAc2mBSe";
        config.accessKeySecret = "fF2v0Rlhvb9EyjHPdZUt1ywovqq6ba";
        config.regionId = "cn-shanghai";

        Client client = new Client(config);



//        QueryDeviceRequest queryDeviceRequest = new QueryDeviceRequest()
////                .setIotInstanceId("iot-06z00f11l5xzl5c")
//                .setProductKey("a11rlwZ6xHw");
//        QueryDeviceResponse queryDeviceResponse = client.queryDevice(queryDeviceRequest);
//        System.out.println(queryDeviceResponse);
//        GetDeviceStatusRequest getDeviceStatusRequest = new GetDeviceStatusRequest()
//                .setProductKey("a11rlwZ6xHw");
//        GetDeviceStatusResponse deviceStatus = client.getDeviceStatus(getDeviceStatusRequest);
//        System.out.println(deviceStatus);
//        QueryDevicePropertyStatusRequest queryDevicePropertyStatusRequest = new QueryDevicePropertyStatusRequest()
//                .setProductKey("a11rlwZ6xHw")
//                .setDeviceName("Elfin-EW11_07");
//        QueryDevicePropertyStatusResponse queryDevicePropertyStatusResponse = client.queryDevicePropertyStatus(queryDevicePropertyStatusRequest);
//        QueryDevicePropertyStatusResponseBody.QueryDevicePropertyStatusResponseBodyDataList list = queryDevicePropertyStatusResponse.getBody().getData().getList();
//        System.out.println(list);
//        System.out.println(queryDevicePropertyStatusResponse);


    }

}
