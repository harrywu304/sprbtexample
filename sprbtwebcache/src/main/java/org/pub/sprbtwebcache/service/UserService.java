package org.pub.sprbtwebcache.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
    @CachePut(value = "testcache", key = "#state")  
    public String doSaveCache(String state, String bizRedirectUrl){
    	logger.debug("UserService doSaveCache: {}, {}",state,bizRedirectUrl);
    	return bizRedirectUrl;
    }
	
    /**
     * 从缓存中获取业务返回url
     * @param state
     * @return
     */
    @Cacheable(value="testcache", key = "#state", unless="#result == null")
    public String doGetCache(String state){
    	logger.debug("UserService doGetCache expired: {}",state);
    	return "efg";
    }

}
