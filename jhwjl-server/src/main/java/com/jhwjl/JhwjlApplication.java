package com.jhwjl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
@EnableTransactionManagement
public class JhwjlApplication {
    public static void main(String[] args) {
        SpringApplication.run(JhwjlApplication.class, args);
        log.info("启动成功");
    }
}
