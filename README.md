# 尚医通     yygh_parent


## 器服务
116.62.243.7

## 项目地址

https://www.bilibili.com/video/BV1V5411K7rT?p=1&vd_source=0c666c102e27d8f3b37f99ac269b1d2b
资料地址
https://pan.baidu.com/s/1GfkpJqPXGX9MszHDfyTM9g?pwd=yyds#list/path=%2F%E5%B0%9A%E7%A1%85%E8%B0%B7Java%E5%AD%A6%E7%A7%91%E5%85%A8%E5%A5%97%E6%95%99%E7%A8%8B%EF%BC%88%E6%80%BB207.77GB%EF%BC%89%2F4.%E5%B0%9A%E7%A1%85%E8%B0%B7%E5%85%A8%E5%A5%97JAVA%E6%95%99%E7%A8%8B%E2%80%94%E5%AE%9E%E6%88%98%E9%A1%B9%E7%9B%AE%EF%BC%8871.89GB%EF%BC%89%2F%E5%8C%BB%E7%96%97%E9%A1%B9%E7%9B%AE--%E5%B0%9A%E5%8C%BB%E9%80%9A

## 记录
   

## swagger
http://localhost:8201/swagger-ui.html

## hosp-manager
http://localhost:9998/

## nacos
http://116.62.243.7:8848/nacos/

## 后端技术

### Redis
使用redis做缓存
验证码有效时间，支付二维码有限时间

### MongoDB
使用MongDB存储医院数据

### EasyExcel
EasyExcel 读和写
service-cmn

### RabbitMq
发送者 接受者
订单相关操作，发送mq消息 解耦合

### Docker
下载镜像 
创建容器

### 短信 
阿里云  service-msm

### 阿里云OSS文件系统
阿里云OSS   service-oss  
对象存储


### 微信

#### 微信登录
OAuth2
授权认证
https://open.weixin.qq.com/cgi-bin/showdocument?action=dir_list&t=resource/res_list&verify=1&id=open1419316505&token=e547653f995d8f402704d5cb2945177dc8aa4e7e&lang=zh_CN

#### 支付
生产微信支付二维码  WeixinController.createNative

