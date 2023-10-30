package com.ydlclass.spring.api;

public interface BeanFactory  {


    /**
     * 通过名字获取bean
     * @param name bean的名字
     * @return 拿到bean
     */
    Object getBean(String name);

}
