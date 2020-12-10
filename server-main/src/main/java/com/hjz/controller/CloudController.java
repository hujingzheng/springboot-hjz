package com.hjz.controller;

import com.alibaba.fastjson.JSON;
import com.hjz.model.StudentVo;
import com.hjz.service.otherServer.Server2FeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Api(tags = "springCloud测试")
@RestController
@RequestMapping("/springcloud")
public class CloudController {

    @Autowired
    private Server2FeignClient server2FeignClient;

    @ApiOperation(value = "feign测试",notes = "发送一个请求")
    @GetMapping(value = "/feignTest")
    public String feignTest(){
        StudentVo vo = new StudentVo();
        vo.setAge(1);
        vo.setName("lalalala");
        vo.setId(1);

        StudentVo result = server2FeignClient.getData(vo);
        return JSON.toJSONString(result);
    }

}
