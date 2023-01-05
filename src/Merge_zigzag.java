
public class Merge_zigzag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a= {1,3,5,7,9};
		int b[]= {2,4,6,8,10};
		int j=0;
		int c[]=new int [a.length+b.length];
		
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[j]=a[i];
			j++;
			}
			 if(i<b.length)
			{
				c[j]=b[i];
				j++;
			}
			System.out.print(c[i]);
		}

	
	}
}
