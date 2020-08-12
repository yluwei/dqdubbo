package cn.yanluwei.dq.service.impl;

import cn.yanluwei.dq.api.HelloWorldService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 你好
 *
 * @author yanluwei
 * @date 2020/8/12
 */
@Service
public class HelloworldServiceImpl implements HelloWorldService {
    @Override
    public String helloWorld(String name) {
        System.out.println("你好 " + name);
        return "你好 " + name;
    }
}
