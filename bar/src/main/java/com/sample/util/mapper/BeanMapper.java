package com.sample.util.mapper;

import org.dozer.DozerBeanMapper;

public class BeanMapper {

  private final static DozerBeanMapper dozer = new DozerBeanMapper();

  public static DozerBeanMapper getDozerBeanMapper() {
    return dozer;
  }


}
