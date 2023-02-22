package collections;

import java.util.ArrayList;

public class Practice
{
	public static void main(String[] args) 
	{
	
		ArrayList al=new ArrayList();
		
		al.add("Priyanka");
		al.add(24);
		al.add(67.4f);
		al.add(null);
		al.add("Avni");
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.contains("Avni"));
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf("Avni"));
		System.out.println(al.get(1));
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.clone());
		
		al.add(2, "Avni");
		System.out.println(al);
	}
}
