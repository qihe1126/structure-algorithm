#### MYSQL View
视图的检查选项
在创建视图的时候可以添加 with local check option 或者是 with cascaded check option
使用 with check option 子句创建时，mysql会通过视图检查正在更改的每一行，（插入、更新、删除）、
##### CASCADED 和LOCAL的区别
```
CASCADED
view v1 id<=20    
view v2 id>=10 with cascaded check option
相当于v1也添加了 with cascaded check option
```

```
LOCAL
view v1 id<=20    
view v2 id>=10 with local check option
Mysql8.0的效果：v1定义则检查 v1没有定义则不检查
```


#### MYSQL 锁
1. 全局锁 库中所有表
2. 表级锁 整张表
3. 行级锁 对应行数据
