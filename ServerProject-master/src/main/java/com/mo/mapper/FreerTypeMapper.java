package com.mo.mapper;

import com.mo.pojo.FreerType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @create 2022-05-04 17:47
 */
@Mapper
@Repository
public interface FreerTypeMapper {

    Collection<FreerType> getAll();

    Collection<FreerType> searchFreerType(String name);

}
