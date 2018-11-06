package com.learning.jwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  /* Maps to all HTTP actions by default (GET,POST,..)
   * The return format is of JSON and can be made using JSONObject*/
  @RequestMapping("/users")
  public @ResponseBody String getUsers() {
    return "{\"users\":[{\"firstname\":\"Urs\", \"lastname\":\"NG\"}," +
           "{\"firstname\":\"P\",\"lastname\":\"S\"}]}";
  }
}