package com.example.imagegen.service;

import org.springframework.stereotype.Service;

import com.example.common.entity.ImageGenETO;

@Service
public class ImgGenService {
  
  public void generateImage() {
    System.out.println("Image generated successfully.");
    ImageGenETO imageGenETO = new ImageGenETO();
    imageGenETO.setId("1");
    imageGenETO.setName("ImageGen");
    imageGenETO.setDescription("ImageGenETO description");
    System.out.println("Image generated successfully with: " + imageGenETO);
  }
}
