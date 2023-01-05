package com;

public class Freq_In_String {
	public static void main(String[] args) {
		
		int[]a=new int[128];
	String s="today is friday ";
	
	
	for(int i=0;i<s.length();i++)
	{
	  char c=s.charAt(i);
	  a[c]++;
	}
	
	for(int i=0;i< a.length;i++) {
		if(a[i]!=0)
		{
		System.out.println((char)i +"  is presnet  " + a[i] +"  times  ");
		}
	}

	
}
}
