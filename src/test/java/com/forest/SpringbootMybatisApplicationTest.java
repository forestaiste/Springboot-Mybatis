package com.forest;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import org.junit.Test;

import java.sql.SQLException;

public class SpringbootMybatisApplicationTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }
}
