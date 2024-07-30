﻿<p align="center">
  <h3 align="center">Galaxy</h3>
  <p align="center">
    实现在HTTP报文二次加密场景下自动解密的功能
    <br />
          <br />
<a href="https://github.com/outlaws-bai/Galaxy/stargazers"><img alt="GitHub stars" src="https://img.shields.io/github/stars/outlaws-bai/Galaxy"/></a>
<a href="https://github.com/outlaws-bai/Galaxy/releases"><img alt="GitHub releases" src="https://img.shields.io/github/release/outlaws-bai/Galaxy"/></a>
<a href="https://github.com/outlaws-bai/Galaxy/releases"><img alt="Downloads" src="https://img.shields.io/github/downloads/outlaws-bai/Galaxy/total?color=brightgreen"/></a>
<br>
<br>
<a href="https://github.com/outlaws-bai/Galaxy/blob/main/docs/README-EN.md">English</a> | 
    <a href="https://github.com/outlaws-bai/Galaxy/releases">Download</a> | 
    <a href="https://github.com/outlaws-bai/Galaxy/blob/main/docs/FAQ.md">FAQ</a> | 
    <a href="https://github.com/outlaws-bai/Galaxy/issues">Issue</a>
  </p>

# 功能介绍


## Http Hook

启用成功后有如下效果：

1. 后续代理的所有请求和响应自动解密。
2. 已解密请求转到Repeater后Send，得到的响应也会被解密。
3. Intruder、Scanner等模块同样支持。

> 已包含多种加解密场景示例，对于常规算法及逻辑可以做到开箱即用。

进一步了解：[Http Hook](https://github.com/outlaws-bai/Galaxy/blob/main/docs/HttpHook.md)

![hook](https://raw.githubusercontent.com/outlaws-bai/picture/main/img/hook.gif)

## 其他功能

1. [Parse Swagger Api Doc](https://github.com/outlaws-bai/Galaxy/blob/main/docs/Other.md#Parse-Swagger-Api-Doc):  解析swagger文档，生成所有URL的请求，并带入参数、路径、描述。
2. [Bypass Host Check](https://github.com/outlaws-bai/Galaxy/blob/main/docs/Other.md#Bypass-Host-Check):  绕过服务端在csrf/ssrf的测试点对host做了验证。
3. [Bypass Auth Of Path](https://github.com/outlaws-bai/Galaxy/blob/main/docs/Other.md#Bypass-Auth-Of-Path):  通过修改Path的方式绕过某些认证/鉴权/拦截。
4. ...

# 安装指引

插件下载：[Download](https://github.com/outlaws-bai/Galaxy/releases)

插件安装：`Extender -> Extensions -> Add -> Select File -> Next`

自行构建：`build.gradle -> shadowJar`

**注意事项**:

1. 项目采用Burp `Montoya API` 开发，Burp版本不低于 `v2023.10.3.7` 。 [Update](https://github.com/outlaws-bai/Galaxy?tab=readme-ov-file#%E5%B8%B8%E7%94%A8%E5%9C%B0%E5%9D%80)
2. 项目使用JDK 17进行开发及编译，请确保启动Burp的JDK不低于17。 [Update](https://github.com/outlaws-bai/Galaxy?tab=readme-ov-file#%E5%B8%B8%E7%94%A8%E5%9C%B0%E5%9D%80)
3. 项目使用了动态编译，请确保启动Burp的是JDK，而不是JRE。[Modify](https://github.com/outlaws-bai/Galaxy/blob/main/docs/ToJDK.md)

# 优势特点

1. 简单高效：不需要启动多余的本地服务。
2. 上手容易：通用算法及常见加密逻辑已内置，基本能做到开箱即用。
4. 支持面广：如加密算法组合、自定义算法、动态密钥等均可以支持。
4. 强灵活性：可以使用python、js、Java、grpc多种方式实现加解密以满足需求。

# Next

1. 支持配合桌面扫描器一起使用，使得扫描器可以扫描明文请求并得到明文响应。
2. 提出在涉及非对称加密（不已知私钥）下的使用方法。

# 交流

> star码住，避免迷路 ~
>

如果你发现BUG或有好的建议，欢迎在GitHub上提Issue或扫码添加下方微信群一起交流讨论。

(二维码失效请添加wx号outlaws_bai，并备注 `Galaxy交流` 。)

![image-20240730211916457](https://raw.githubusercontent.com/outlaws-bai/picture/main/image-20240730211916457.png)

# Stars

[![Stargazers over time](https://starchart.cc/outlaws-bai/Galaxy.svg?variant=adaptive)](https://starchart.cc/outlaws-bai/Galaxy)

# 常用地址

[BurpDownload](https://portswigger.net/burp/releases#professional)

[BurpJavaDoc](https://portswigger.github.io/burp-extensions-montoya-api/javadoc/burp/api/montoya/MontoyaApi.html)

[BurpExtExamples](https://github.com/PortSwigger/burp-extensions-montoya-api-examples)

[JDK17Download](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)

[JDK21Download](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html)