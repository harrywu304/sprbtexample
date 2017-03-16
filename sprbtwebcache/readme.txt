注意：
1) 从当前的实践来看，spring cache的annotation在@Controller中使用都会直接被忽略。但是在@Service中使用是没有问题的。
condition属性会在方法执行前后都判断，会影响读取是否回写缓存；
unless只在方法执行后使用，只会影响回写缓存。

2)使用ehcache时服务器的hostname需要配置有指向IP否则启动会出错。

======================================================================
在Spring Boot中通过@EnableCaching注解自动化配置合适的缓存管理器（CacheManager），Spring Boot根据下面的顺序去侦测缓存提供者：
Generic
JCache (JSR-107)
EhCache 2.x
Hazelcast
Infinispan
Redis
Guava
Simple

除了按顺序侦测外，我们也可以通过配置属性spring.cache.type来强制指定。我们可以通过debug调试查看cacheManager对象的实例来判断当前使用了什么缓存。
本文中不对所有的缓存做详细介绍，下面以常用的EhCache为例，看看如何配置来使用EhCache进行缓存管理。
在Spring Boot中开启EhCache非常简单，只需要在工程中加入ehcache.xml配置文件并在pom.xml中增加ehcache依赖，框架只要发现该文件，就会创建EhCache的缓存管理器

参考：
http://www.jianshu.com/p/64f684bd0ce9
