### 使用说明
> tars-maven-plugin为tars结构体转Java源文件的插件，使用方法参考Android项目下的win_tars2jar任务

1. 修改了生成Java源文件中的import，使用了com.kingsunedu.sdk:tars:1.0.0替换原本tars的jar包
2. 以后如有修改，修改后使用命令行到当前tars-maven-plugin目录下，输入mvn clean install会自动将项目发布到mavenLocal（一般为c:/users/username/.m2下）
3. 如Android项目，以后再调用gradlew win_tars2jar任务即可生成对应的Java源文件