# spring整合hibernate-jpa

### 使用hibernate5的HibernateTemplate模板类操作数据库

#### 关于readOnly异常：

```
org.springframework.dao.InvalidDataAccessApiUsageException: 
Write operations are not allowed in read-only mode (FlushMode.MANUAL): 
Turn your Session into FlushMode.COMMIT/AUTO or remove 'readOnly' marker from transaction definition.

执行更新、添加、删除时出现，主要是因为将事务托管到Spring中，需要正确的配置切面，从而正确的实现代理

<!--配置切面-->
<aop:config>
    <!--这个配置不对的话使用HibernateTempl会报错-->
    <aop:pointcut id="hibernateTrasactionPointcut"
                  expression="execution(* com..*.service..*(..))"/>
    <aop:advisor advice-ref="hibernateTransactionAdvice"
                 pointcut-ref="hibernateTrasactionPointcut"/>
</aop:config>