package com.bjpowernode.web;

import com.bjpowernode.web.mapper.DbMapper;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ApplicationTest {
    @Resource(type = DbMapper.class)
    DbMapper mapper;

    @Test
    public void test() {
        mapper.selectAll().forEach(System.out :: println);
        System.out.println("---");
    }
}
