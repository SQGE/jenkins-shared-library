# Jenkins共享库最佳实践

本项目为共享库最佳实践示例

```
+- vars
|   +- runPipeline.groovy   # 入口文件
|   +- pipelineCfg.groovy   # 把yaml 文件转成 map
|   +- pythonPipeline.grooy # 按照语言去分类的模板库
```

# 项目存储库在项目根目录
### pipeline.yaml 
```
type: test
node: master
```
### jenkinsfile
```
#!groovy   
@Library('jenkinslibrary@master') _

runPipeline()
```

[参考链接](https://mp.weixin.qq.com/s?__biz=MzIzODIwNDg5NA==&mid=2247483830&idx=1&sn=29b69b6de61e4b9cf52f486788be9e42&chksm=e93da307de4a2a11ba4e12cdbc5b38fa7529bcf15352d3dca58e126c374a2ebdf063f5a76d76&mpshare=1&scene=1&srcid=07263xmk2Rtx9CN14kwnbOqk&sharer_sharetime=1595747141011&sharer_shareid=8a5a5f5da305d6af4ee5c3458648754f&key=872f9623724a6dd2e65c08c344a06d5368cb32371152f62c2bc6681a5622e5e0793446874ff6d52f6abbf18d125fb19ef20c9d1602f2b13c82e2712aeec4b757bbef7e8694e018d7f8d4bb52c92c0649&ascene=1&uin=MTM0OTkwNzU0MA%3D%3D&devicetype=Windows+10+x64&version=62090529&lang=zh_CN&exportkey=AaZ%2BxFcx%2FDCx7M5YCxQTmas%3D&pass_ticket=XtfaSOWEVGBC%2BGWJIotgrU4yCQeRSHos2tCpaZiZBeErFlDDxX3ukSUc4hJBJuRX)
[参考链接](https://blog.opstree.com/2019/09/04/jenkins-pipeline-global-shared-libraries/)
