
[mem0](https://github.com/mem0ai/mem0)项目(通过智能内存层增强 AI 助手和代理，实现个性化的 AI 交互。它会记住用户偏好，适应个人需求，并随着时间的推移不断学习，非常适合客户支持聊天机器人、AI 助手和自主系统，提供自部署的mem0服务)的简易版Java版客户端,支持对mem0的增删改查功能，可以无缝接入到Java项目中（例如SpringBoot、Spring AI、langchain4j）。

## 使用

- 参考：[mem0-client-java-example](https://github.com/NingNing0111/mem0-java/blob/master/mem0-client-java-example/src/test/java/me/pgthinker/AppTest.java)

## 服务端启动

```shell
cd mem0-server
uv venv .venv
uv pip install
./.venv/bin/uvicorn main:app --host 127.0.0.1 --port 8833 --reload
```
