import java.util.Iterator;

public class operString {

	public static void main(String[] args) {
		
		String s="ajay";
		  char c[]=s.toCharArray();
		  for(int i=0;i<c.length;i++)
		  {
			  if (c[i]>='a' && c[i]<='z')
			  {
				  c[i]=(char)(c[i]-32);
			  }
			  else if(c[i] >='A'&& c[i]<='Z')
			  {
				  c[i]=(char)(c[i]+32);
			  }
		  }
		  for(int i=0;i<c.length;i++)
		  {
			  System.out.print(c[i]);
		  }
	
		
		
	}

}
