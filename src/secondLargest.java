
public class secondLargest {

	public static  int SecondLargest(int a[])
	{  int m1=a[0];
	   int m2=a[0];
	   for (int i = 0; i < a.length; i++) {
		
		   if(a[i]>m1)
		   {
			   m2=m1;
			   m1=a[i];
			   
		   }else if(a[i]>m2)
		   {
			   m2=a[i];
			   
		   }
	}
		
		
		return   m2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={ 1,5,6,8};
		
	 
		System.out.println( "second largest ele is " +SecondLargest(a));

	}

}
