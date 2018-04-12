package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
@Qualifier("cold")//通过qualifer注解注定生成的bean限定符
public class IceCream implements Dessert {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("正在吃冰激凌");
		
	}

}
