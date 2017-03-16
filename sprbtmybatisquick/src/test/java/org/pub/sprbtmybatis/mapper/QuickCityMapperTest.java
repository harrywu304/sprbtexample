package org.pub.sprbtmybatis.mapper;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.pub.sprbtmybatis.bean.City;

import base.BaseSprbtJunitTest;

public class QuickCityMapperTest extends BaseSprbtJunitTest{
	
	@Resource
	QuickCityMapper qCityMapper;

	@Test
	public void testFindByName() {
		City city = qCityMapper.findByName("广州");
		assertEquals("广东",city.getState());
	}
	
	@Test
	public void testFindById() {
		City city = qCityMapper.findById(1);
		assertEquals("河北",city.getState());
	}

}
