package com.db.stu;
import java.util.ArrayList;

public class TestHello {
	public static <T> void DisplayArray(T[] anArray){
		for(T t:anArray)
		{
			System.out.println(t);
			System.out.println("----");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strArray []={"ABC","DEF","HIJ"};
		DisplayArray(strArray);
		Integer intArray []={1,2,3,4,5};
		DisplayArray(intArray);




	}

}