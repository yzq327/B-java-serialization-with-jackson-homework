package com.thoughtworks.capability.gtb.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.capability.gtb.vo.EventType;
import com.thoughtworks.capability.gtb.vo.EventVo;
import com.thoughtworks.capability.gtb.vo.PersonVo;
import com.thoughtworks.capability.gtb.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PersonController {

  @GetMapping("/persons/{id}")
  public PersonVo getPerson(@PathVariable("id") String id) throws JsonProcessingException {
    PersonVo personVo = new PersonVo(id, null, "张三", null);
    ObjectMapper objectMapper = new ObjectMapper();
    String valueAsString = objectMapper.writeValueAsString(personVo);
    return personVo;
  }
}
