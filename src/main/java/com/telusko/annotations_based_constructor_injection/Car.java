package com.telusko.annotations_based_constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class Car implements  Vehicle
{

	public void drive()
	{
		System.out.println("Chal Raha Hai.....");
	}
}