package com.example.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonApp {
  public static void main(String[] args) {
    SpringApplication.run(CommonApp.class, args);
    System.out.println("CommonApp started successfully.");
  }
}
