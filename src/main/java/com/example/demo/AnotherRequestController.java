package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/anotherWorking")
public class AnotherRequestController extends AnotherAbstractController {

  @Override
  public ResponseEntity<String> post(@RequestBody Map body) {
    return super.post(body);
  }


}
