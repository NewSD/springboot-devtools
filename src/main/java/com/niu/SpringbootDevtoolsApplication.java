package com.niu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDevtoolsApplication {

	public static void main(String[] args) {
		System.out.println("devtools test");
		System.out.println("devtools test34");
		System.out.println("devtools test54");
//		Ctrl+Shift+Alt+/快捷键调出Maintenance页面,选择1.Registry...
//      勾选compiler.automake.allow.when.app.running复选框
//		引入Spring-boot-devtools后,只要classpath路径下的文件发生改变
//		项目就会自动重启,每次改动都会重启,有点太烦人了

		SpringApplication.run(SpringbootDevtoolsApplication.class, args);
	}

}
