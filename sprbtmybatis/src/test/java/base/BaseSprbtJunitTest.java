/**
 * 
 */
package base;

import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wuhuoxin 2016年12月6日 下午2:27:46
 *
 */
@RunWith(SpringRunner.class)
@MapperScan("org.pub.sprbtmybatis.mapper")
@SpringBootTest
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BaseSprbtJunitTest {
	
}
