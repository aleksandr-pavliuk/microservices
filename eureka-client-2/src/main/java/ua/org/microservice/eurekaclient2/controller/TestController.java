package ua.org.microservice.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 * @link http://healthfood.net.ua
 */
@RestController
@RequestMapping("/new")
public class TestController {

  @GetMapping("/name")
  public String name(){
    return "Hell world";
  }

}
