package com.forest.springbootmybatis.controllers;

import com.forest.springbootmybatis.beans.Emp;
import com.forest.springbootmybatis.mappers.EmpDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private EmpDeptMapper empDeptMapper;

    @RequestMapping("hello")
    public List<Emp> hello() {
        return empDeptMapper.getAllEmp();
    }

}
