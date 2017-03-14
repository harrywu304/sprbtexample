package org.pub.sprbtmybatis.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.pub.sprbtmybatis.bean.City;

import base.BaseSprbtJunitTest;

//@MapperScan("org.pub.sprbtmybatis.mapper")
public class CityServiceTest extends BaseSprbtJunitTest{
	
	@Resource
	CityService cityService;

	@Test
	public void testGetAll() {
		List<City> cities = cityService.getAll(1, 1);
		assertEquals(1,cities.size());
	}

	@Test
	public void testGetById() {
		City city = cityService.getById(1);
		assertEquals("石家庄",city.getName());
	}

}
