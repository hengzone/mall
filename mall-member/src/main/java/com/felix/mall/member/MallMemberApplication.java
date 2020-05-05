package com.felix.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.felix.mall.member.mapper")
public class MallMemberApplication {

  public static void main(String[] args) {
    SpringApplication.run(MallMemberApplication.class, args);
  }

}
