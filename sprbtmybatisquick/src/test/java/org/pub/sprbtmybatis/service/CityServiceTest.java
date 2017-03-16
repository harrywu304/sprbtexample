package org.pub.sprbtmybatis.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.pub.sprbtmybatis.bean.City;

import base.BaseSprbtJunitTest;

public class CityServiceTest extends BaseSprbtJunitTest{
	
	@Resource
	CityService cityService;


	@Test
	public void testGetByName() {
		City city = cityService.getByName("广州");
		assertEquals("广东",city.getState());
	}

}
