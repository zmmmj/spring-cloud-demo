package pers.zmj.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import pers.zmj.cloud.entity.Dept;
import pers.zmj.cloud.service.DeptService;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 服务提供者的控制层
 */
@RestController
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;
    @Autowired
    private DiscoveryClient client;
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") int id) {
        return deptService.get(id);
    }
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.selectAll();
    }

    //超时测试,该服务的响应时间为 5 秒
    @RequestMapping(value = "/dept/feign/timeout")
    public String DeptFeignTimeout() {
        //暂停 5 秒
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

}
