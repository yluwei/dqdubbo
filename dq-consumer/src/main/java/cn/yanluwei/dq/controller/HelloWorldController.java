package cn.yanluwei.dq.controller;

import cn.yanluwei.dq.api.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 你好
 *
 * @author yanluwei
 * @date 2020/8/12
 */
@RestController
public class HelloWorldController {

    @Resource
    private HelloWorldService helloWorldService;

    @GetMapping("/hello")
    public String helloWorld() {
        return helloWorldService.helloWorld("first");
    }
}
