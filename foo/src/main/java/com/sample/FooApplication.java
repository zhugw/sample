package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sample.util.mapper.BeanMapper;

@SpringBootApplication
public class FooApplication {

  public static void main(String[] args) {
    SpringApplication.run(FooApplication.class, args);
  }

  @Bean
  public Mapper fooDozerBeanMapper() {
    DozerBeanMapper mapper = BeanMapper.getDozerBeanMapper();
    List<String> mappingFiles = new ArrayList(mapper.getMappingFiles());
    mappingFiles.add("foo-dozer-custom-convert.xml");
    mapper.setMappingFiles(mappingFiles);
    return mapper;
  }


}
