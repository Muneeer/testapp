package com.example.imagegen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.imagegen.service.ImgGenService;

// @SpringBootApplication
// @SpringBootApplication(scanBasePackages = "com.example.common")
public class ImageGenApp {
  public static void main(String[] args) {
    SpringApplication.run(ImageGenApp.class, args);
    System.out.println("ImageGenApp started successfully.");
    ImgGenService imgGenService = new ImgGenService();
    imgGenService.generateImage();
  }
}
