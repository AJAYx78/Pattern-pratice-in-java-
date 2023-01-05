package com.jsp.task;
import  java.util.StringJoiner;

public class Father {
	
	public static void main(String[] args) {
		
	
	int count =0;
	
	String name="ajay";

 
	char c[]=name.toCharArray();
	int d[]=new int[c.length];
	char a=c[0];
	{
		int  n=c.length;
	for(int i=1;i<n;i++)
	{
		if(c[i]==a)
		{
			for(int j=1;j<d.length;j++)
			{
				count++;
			}
			
		}
	}
	

	
	
	System.out.println(count);
}

	
	}
	
	
}
