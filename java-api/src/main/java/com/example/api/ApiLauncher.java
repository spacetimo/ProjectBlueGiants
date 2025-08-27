
// Spring Bootのエントリポイント
package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * Spring Boot起動class
 * mainメソッドからアプリケーションを起動するっぽい
 */
public class ApiLauncher {
    /**
     * アプリケーションのエントリポイント
     * @param args cmd引数
     * 
     */
    public static void main(String[] args) {
        SpringApplication.run(ApiLauncher.class, args);
    }
}
