1、创建工程



### 拦截器
- 浏览器
    - /*
        + 静态资源
        + 动态资源
          + 过滤器
            + 中央控制器
              + 统一处理落尽
              + Controller
              + 统一处理逻辑

拦截器
    是一种动态拦截方法调用的机制
- 在指定的方法调用前后执行预先设定的代码
- 阻止原始方法的执行


拦截器与过滤器
- 归属不同：Filter属于servlet；Interceptor属于SpringMvc
- 拦截内容不同：Filter对所有访问进行增强，Interceptor仅针对SpringMVC的访问进行增强

步骤
- 制作拦截器功能类
- 配置拦截器的执行位置



            





### 自增主键设置
![img.png](img.png)