package org.pub.sprcloud.sprresttemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import hello.Quote;

/**
 * Hello world!
 *
 */
public class App 
{
	 private static final Logger log = LoggerFactory.getLogger(App.class);
	 
    public static void main( String[] args )
    {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}
