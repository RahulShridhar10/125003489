package com.springboot.learn_spring_boot;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	private List<Integer> numbers = new ArrayList<>();
	
		private List<Integer> currenstate = new ArrayList<>();
		private List<Integer> prevstate = new ArrayList<>();
		private float avg;
		//contructor 
		//getter
		//tostring
		public Calculator(List<Integer> numbers, List<Integer> currenstate, List<Integer> prevstate, float avg) {
			super();
			this.numbers = numbers;
			this.currenstate = currenstate;
			this.prevstate = prevstate;
			this.avg = avg;
		}
		public List<Integer> getNumbers() {
			return numbers;
		}
		public void setNumbers(List<Integer> numbers) {
			this.numbers = numbers;
		}
		public List<Integer> getCurrenstate() {
			return currenstate;
		}
		public void setCurrenstate(List<Integer> currenstate) {
			this.currenstate = currenstate;
		}
		public List<Integer> getPrevstate() {
			return prevstate;
		}
		public void setPrevstate(List<Integer> prevstate) {
			this.prevstate = prevstate;
		}
		public float getAvg() {
			return avg;
		}
		public void setAvg(float avg) {
			this.avg = avg;
		}
		
}
