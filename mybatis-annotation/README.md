### mybatis-annotation

### PageHelper 做分页

- 以拦截器的方式，重新封装查询

- 依赖
```
        <!-- pagehelper -->
        <dependency>
            <groupId>com.github.pagehelper</groupId>
            <artifactId>pagehelper-spring-boot-starter</artifactId>
            <version>1.2.5</version>
        </dependency>
```
- 配置
```
#pagehelper分页插件
pagehelper:
 helperDialect: mysql
 reasonable: true
 supportMethodsArguments: true
 params: count=countSql
```
- 代码
```
 /**
     * PageHelper 做分页
     */
    @Test
    void selectPage() {
        PageHelper.startPage(2,2);
        SelectDSLCompleter selectDSLCompleter = SelectDSLCompleter.allRows();
        List<User> users = userMapper.select(selectDSLCompleter);
        PageInfo<User> pageInfo = new PageInfo<User> (users);
        for (int i = 0; i <pageInfo.getList().size() ; i++) {
            System.out.println(pageInfo.getList().get(i).getId());
        }
    }
```
