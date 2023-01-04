package javaProgPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I am automation tester";
int a=10;
double b=10.5;
double c=11.7;
//for(int i=str.length()-1;i>=0;i--) {
//	System.out.print(str.charAt(i));
		
	//	StringBuffer s=new StringBuffer("I am automation tester");
	//	System.out.println(s.reverse());


ArrayList<String> list=new ArrayList<String>();
list.add("Najuka");
list.add("Teke");
list.add("One");
list.add("Two");
list.add("hree");
Collections.reverse(list);

System.out.println(list);
Collections.sort(list);
System.out.println(list);



//System.out.println(str.toUpperCase());
//System.out.println(str.toLowerCase());
//System.out.println(str.substring(5));
//System.out.println(str.substring(0, 5));
//System.out.println(str.replace("automation", "manual"));
System.out.println(str.valueOf(b));
String st=str.valueOf(b);
String st1=str.valueOf(c);
System.out.println(st+st1);
}
	}

// }
