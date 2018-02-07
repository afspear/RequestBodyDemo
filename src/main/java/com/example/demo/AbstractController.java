package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class AbstractController {
  private final Logger logger = LoggerFactory.getLogger(getClass());



  public ResponseEntity<String> post(@RequestBody Map body) {

    logger.debug("body : {}", body);

    return new ResponseEntity(body, HttpStatus.OK);

  }
}
