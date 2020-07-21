package com.forest.springbootmybatis;

import com.forest.springbootmybatis.mappers.EmpDeptMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.forest.springbootmybatis.mappers")
@SpringBootApplication
public class MybatisLearn {

    public static void main(String[] args) {
        SpringApplication.run(MybatisLearn.class, args);
    }

}


