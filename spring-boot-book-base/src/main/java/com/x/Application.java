package com.x;


import com.x.base.Constant.BaseConstant;
import com.x.core.launch.XApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: weihuijie
 * @date: 2020/12/14
 * @description: 启动器
 */
// 标志为 springboot 项目
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        XApplication.run(BaseConstant.appName,Application.class,args);
    }
}
