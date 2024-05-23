package Anudip24;

import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
      //++ , -- Post/Pre
		//int i=5,j=0;
	//	i++;//i=i+1 Post increment
	//	++i;//i=i+1 Pre increment
	//	i--;//i=i-1 Post decrement
	//	--i;//i=i-1 Pre decrement
	//	j=i++;//step 1:j=i step 2:i=i+1
	//	j=++i;//step 1:i=i+1 step 2:j=i
	//	j=i--;//step 1:j=i step 2:i=i-1
	//  j=--i;//step 1:i=i-1 step 2:j=i
		//System.out.println("i:"+i+" j:"+j);
		int a = 10, b = 10;
		//b = a++;
		//b = ++a;
		b = --a;
		System.out.println(b);
	}

}
