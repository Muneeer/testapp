package com.example.imagegen.service;

import com.example.common.entity.ImageGenETO;
import org.springframework.stereotype.Service;


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
