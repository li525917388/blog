package com.ldh.bk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@MapperScan(value={"com.ldh.bk.mapper"})
@SpringBootApplication
public class AppStart {
	
	public static void main( String[] args ) {
    	
    	SpringApplication.run(AppStart.class, args);
    	
    	System.out.println("(♥◠‿◠)ﾉﾞ  启动成功   ლ(´ڡ`ლ)ﾞ  \n");
	}
}
