package com.bjpowernode.web.service.impl;

import com.bjpowernode.web.mapper.DbMapper;
import com.bjpowernode.web.service.IndexService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    @Resource(type = DbMapper.class)
    DbMapper mapper;

    @Override
    public void doSome() {
        System.out.println("hi");
    }
}
