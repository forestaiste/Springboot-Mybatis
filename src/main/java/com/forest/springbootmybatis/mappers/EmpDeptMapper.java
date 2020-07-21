package com.forest.springbootmybatis.mappers;

import com.forest.springbootmybatis.beans.Dept;
import com.forest.springbootmybatis.beans.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDeptMapper {

    List<Emp> getAllEmp();

    Emp getEmpStep(String eid);

    Dept getDeptEmpsByDid(String did);

    Dept getOnlyDeptByDid(String did);

    List<Emp> getEmpListByDid(String did);
}