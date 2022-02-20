package ua.org.microservice.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 * @link http://healthfood.net.ua
 */
@RestController
@RequestMapping("/main")
public class TestController {


  @GetMapping("/test")
  public String test(){
    return "test ";
  }


}
