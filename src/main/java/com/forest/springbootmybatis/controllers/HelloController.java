package com.forest.springbootmybatis.controllers;

import com.forest.springbootmybatis.beans.Emp;
import com.forest.springbootmybatis.mappers.EmpDeptMapper;
import com.forest.springbootmybatis.services.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private EmpDeptMapper empDeptMapper;

    @Autowired
    private AsyncService service;

    @RequestMapping("hello")
    public List<Emp> hello() {
        return empDeptMapper.getAllEmp();
    }

    @RequestMapping("hi")
    public String hi() throws Exception{
        service.hi();

        return "OK";
    }

}
