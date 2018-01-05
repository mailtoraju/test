package com.cusat.cookie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Generics {
	  public static <T> void m1(T  l){
		  System.out.println("read only "+l); 
	  }
	
			public static void main(String[] args) {
				ArrayList<String> al=new ArrayList<String>();
				al.add("hello");
				
				m1(al);
				
				
				ArrayList<Integer> ss=new ArrayList<Integer>();
				ss.add(3);
				m1(ss);
				
				 ArrayList  l = new ArrayList();
			     l.add("pankaj");
			     l.add("ram");
			     l.add(new Integer(6));
			     String name1= (String) l.get(0);  //CE: Incompatible types 
			     
			     
			     List list=new ArrayList();
			     List list1=new LinkedList();
			     List list2= new Vector();
			     
			     
			     Collection l1=new ArrayList();
			     Collection l2=new LinkedList();
			     Collection l12 = new Vector();
			     
			     
			    // List<Object>  strList=new ArrayList<String>();  //compile time error parameter type polymorphism is not aplicable
			     
			     



			}
}
