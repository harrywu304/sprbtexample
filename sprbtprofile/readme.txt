该示例演示了如何结合Spring boot的多环境配置特性和Maven的Profile特性实现不同环境不同配置。

注意：
1）由于Spring boot已经使用${}作为动态属性占位符，故spring-boot-starter-parent另外指定了@*@作为maven的
动态属性占位符；
2）springboot application配置文件可以使用：spring.profiles.active=@env.name@，指定运行时使用的环境配置文件；
3）代码中除了使用@Value注解还可以使用Environment env变量来获取属性信息；