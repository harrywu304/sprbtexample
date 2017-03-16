/**
 * 
 */
package org.pub.sprbtwebcache.action;

import javax.annotation.Resource;

import org.pub.sprbtwebcache.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 微信网页授权Action
 * @author wuhuoxin 2017年2月22日 上午10:27:25
 *
 */
@Controller
public class WxOauthAction2 {
	
	private static Logger logger = LoggerFactory.getLogger(WxOauthAction2.class);
	
	@Resource
	private UserService userService;
	
    
    @RequestMapping(value="/savecache",method={RequestMethod.GET})
    @ResponseBody
    public String savecache(String state, String bizRedirectUrl) {
    	logger.debug(this.toString());
    	userService.doSaveCache(state,bizRedirectUrl);
    	return "savecache ok";
    }
    
    @RequestMapping(value="/getcache",method={RequestMethod.GET})
    @ResponseBody
    public String getcache(String state) {
    	return userService.doGetCache(state);
    }
    
    /**
     * 存储业务返回url到缓存
     * @param state
     * @param bizRedirectUrl
     * @return
     */
    @CachePut(value = "testcache", key = "#state")  
    public String doSaveCache(String state, String bizRedirectUrl){
    	logger.debug("doSaveCache: {}, {}",state,bizRedirectUrl);
    	return bizRedirectUrl;
    }
    
    /**
     * 从缓存中获取业务返回url
     * @param state
     * @return
     */
    @Cacheable(value="testcache", unless="#result == null")
    public String doGetCache(String state){
    	logger.debug("doGetCache expired: {}",state);
    	return "efg";
    }
}
