package cn.yanluwei.dq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动类
 *
 * @author yanluwei
 * @date 2020/8/12
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo-provider.xml"})
public class DQProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DQProviderApplication.class, args);
    }
}
