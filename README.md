#数据订阅
Cannal
#配置中心
Apollo
#服务治理
1.SpringCloud
#Spring Cloud 组件运行：
#所有请求都统一通过 API 网关（Zuul）来访问内部服务。
#网关接收到请求后，从注册中心（Eureka）获取可用服务。
#由 Ribbon 进行均衡负载后，分发到后端的具体实例。
#微服务之间通过 Feign 进行通信处理业务。
2.Dubbo
3.gRpc
#redis
SpringDataRedis
#mq
RocketMq
#鉴权
#IdentityServer4
Spring Security
#分布式日志ELK
Elasticsearch
Logstash
Kibana
Beats
#降级
Hystrix
#负载均衡
Feign
#分布式事务

#分库分表
Sharding jdbc