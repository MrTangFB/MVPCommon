# MVPCommon
MVP灵活构建模式，一Presenter对多Model模式。

# 最新版本
com.github.MrTangFB:MVPCommon:1.0.1

# [`项目的解说及使用方式请点击我`](https://www.jianshu.com/p/b3e15cbf83a9)

# 使用方法
1.确保项目的build.gradle
```
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
```

2.在模块中添加依赖：
```
    dependencies {
            implementation 'com.github.MrTangFB:MVPCommon:tag'
    }
```

# 更新日志
-------
- 2019-06-14 Presenter与Model自动生成，更加解耦。
- 2019-06-13 初代MVP模块式代码提交。
-------