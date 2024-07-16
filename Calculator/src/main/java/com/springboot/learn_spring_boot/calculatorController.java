package com.springboot.learn_spring_boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//return course details with id,name and author
@RestController
public class calculatorController {
	private List<Integer> currenstate = new ArrayList<>();
	private List<Integer> prevstate = new ArrayList<>();
	@RequestMapping("/numbers/e")
	public List<Calculator> retrieveAllCourses()
	{
		int n=5;
		float avg=0;
		for(int i=2;i<10;i+=2)
		{
		currenstate.add(i);	
		avg+=i;
		}
		
		prevstate=currenstate;
		return Arrays.asList(new Calculator(currenstate, currenstate, prevstate, avg/4));
		
	}
	@RequestMapping("/numbers/f")
	public List<Calculator> fiboacci()
	{
		int n=5;
		List<Integer> fibonacciList = new ArrayList<>();
		float avg=0;
		fibonacciList.add(0);
		fibonacciList.add(1);
		for (int i = 2; i < n; i++) {
            int newFibonacciNumber = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(newFibonacciNumber);
            avg+=i;
        }
//		prevstate=currenstate;
		return Arrays.asList(new Calculator(fibonacciList, fibonacciList, prevstate, avg/4));
		
	}

}
