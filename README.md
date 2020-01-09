#详细的应用健康信息
management.endpoint.health.show-details=always
/health
作用：是健康检查
status取值：
* UP：正常
* DOWN：遇到了问题，不正常
* OUT_OF_SERVICE：资源未在使用，或者不该去使用
* UNKNOWN：不知道

#Schema First
1.分析业务（流程图、用例图...架构图等等） --> 建模业务，并且确定架构
2.敲定业务流程（评审）
3.设计API（我需要哪些API呢）/数据模型（表结构设计|类图|ER图等）
4.编写API文档
5.编写代码

---
## API First
先编写代码，再写API文档