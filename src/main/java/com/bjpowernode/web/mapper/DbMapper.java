package com.bjpowernode.web.mapper;

import com.bjpowernode.web.domain.Db;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbMapper {
    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user);

    int insert(Db row);

    Db selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user);

    List<Db> selectAll();

    int updateByPrimaryKey(Db row);
}