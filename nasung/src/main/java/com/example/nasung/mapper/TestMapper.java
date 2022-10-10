package com.example.nasung.mapper;

import java.util.List;

import com.example.nasung.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<TestVo> selectTest();
}