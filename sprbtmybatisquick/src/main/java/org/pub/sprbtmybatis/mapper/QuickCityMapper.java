package org.pub.sprbtmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.pub.sprbtmybatis.bean.City;

@Mapper
public interface QuickCityMapper {
	
    @Select("SELECT * FROM CITY WHERE id = #{id}")
    City findById(@Param("id") int id);

    @Select("SELECT * FROM CITY WHERE name = #{name}")
    City findByName(@Param("name") String name);
    
}
