package com.cusat.cookie;

import java.io.Serializable;

class Genirics<T> {
		T t;
		Genirics(T t){
			this.t=t;
		}
		
		public void show(){
			System.out.println("The type of object : "+ t.getClass().getName());///////////
		}
		
		T getObj(){
			return t;
		}
}
public class DemoGenirics {
	public static void main(String[] args) {
		
		Genirics<String> str =new Genirics<String>("String");
		
		str.show();// The type of object : java.lang.String
		
		System.out.println(str.getObj());//String
		
		Genirics<Integer> intr =new Genirics<Integer>(1);
		
		intr.show();//The type of object : java.lang.Integer
		System.out.println(intr.getObj());//1
		
		Genirics<Double> doub =new Genirics<Double>(1.0d);
		doub.show();//The type of object : java.lang.Double
		System.out.println(doub.getObj());//1.0
		
		
		
		
		class Test<T extends   Integer > {
			T a,b;
		public void method(){
			/*syso(a+b);
			syso(a-b);
			syso(a*b);
			syso(a/b);*/
		}
	}
			//Test<Integer> i111 = new Test<Integer>(); 
			//Test<String> i = new Test<String>();
		
		
	}
}
