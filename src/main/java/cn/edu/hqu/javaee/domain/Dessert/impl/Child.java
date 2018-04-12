package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
public class Child implements Consumer {
	//通过qualifer注解实现指定注入bean
	@Autowired
	@Qualifier("cold")
	private Dessert dessert;

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		dessert.eat();
	}
}
