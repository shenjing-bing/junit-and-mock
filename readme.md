## 单元测试

### 开发人员为什么需要单元测试

1. 代码质量的保证
2. 代码流程细节上的梳理
3. 代码调试更加轻松
4. ......

### 如何编写单元测试

**Follow Arrange, Act, Assert ，The AAA is a general approach to writing more readable unit tests.**

- Arrange 设置变量、实例化对象，并执行测试运行所需的其余设置
- Act 调用测试函数并存储其结果
- Assert 判断断言是否正确

### 一个好的单元测试应该具备哪些条件

1. 尽可能小，一次测试一个需求，快速查明问题
2. 遵循AAA原则，便于阅读
3. 测试边缘案例
4. 无状态

