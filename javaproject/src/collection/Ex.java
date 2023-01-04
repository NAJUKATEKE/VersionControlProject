package collection;

import java.util.ArrayList;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non generic ArrayList
		ArrayList<Object> list =new ArrayList<>();
		list.add("zero");
		list.add(10);
		list.add('c');
		list.add(true);
		list.add(10);
		for(Object temp:list) {                   //for enhanced loop
			System.out.println("using enhanced for:"+temp);
		}
		
		System.out.println("size: "+list.size());
		
		for(int i=0;i<=list.size()-1;i++) {
			
			System.out.println("using for:"+list.get(i));
		}
		System.out.println(list.remove("zero"));
		System.out.println("index of c:"+list.indexOf('c'));
		System.out.println("index of 10: "+list.indexOf(10));
		
		System.out.println("last index of: "+list.lastIndexOf(10));
		
		
	}

}
