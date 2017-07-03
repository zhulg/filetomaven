# filetomaven
fileutils to maven test

基本步骤  
1,到网站注册账号https://bintray.com   
2,注册完获取到api key和密码  
3,相关配置要上传的库代码在build.gradle文件里，分别在主Project 的build.gradle 和要上传的Module的 build.gradle文件里。


    buildscript{
        repositories {
        jcenter()
    }    
    
    dependencies {
        classpath 'com.github.dcendents:android-maven-gradle-plugin:1.3'
        classpath 'com.android.tools.build:gradle:2.2.0-alpha6'
        classpath 'com.jfrog.bintray.gradle:gradle-bintray-plugin:1.2'
        classpath 'com.github.dcendents:android-maven-plugin:1.2'
       } 
    }

要上传的module里增加配置

    ext {
      bintrayRepo = 'xxxx'// 同步的库的名字
      bintrayName = 'xxxxx'//在bintray网站中项目中填写的名称

      publishedGroupId = 'xxxxxx'//一般为包名
      libraryName = 'xxx'//library名字需要和本地的lib module一致
      artifact = 'xxxxx'//同上

      libraryDescription = '.'//项目描述
      libraryVersion = '1.0.0'//项目版本号,只需要在每次更新的时候填写

      developerId = 'xxx'//开发者Id
      developerName = 'xxx '//开发者名称
      developerEmail = 'xxx'//邮箱

      licenseName = 'The Apache Software License, Version 2.0'
      licenseUrl = 'http://www.apache.org/licenses/LICENSE-2.0.txt'
      allLicenses = ['Apache-2.0']
     }

4,运行上传  
./gradlew install  
./gradlew bintrayUpload