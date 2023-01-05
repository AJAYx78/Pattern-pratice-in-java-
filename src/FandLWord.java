import java.util.Iterator;

public class FandLWord {

	public static void main(String[] args) {
		String s="today is mock";
		int n=s.length();
		char c[]=s.toCharArray();
	int f=0;
	for(int i=0;i<n;i++)
	{
		if(i==0&&c[i]!=' ' || c[i]!=' '&&c[i-1]==' ')
		{
			f=i;
			
		}
		if(i==n-1&&c[i]!=' ' || c[i]!=' '&&c[i+1]==' ')
		{
			char ch=c[i];
			c[i]=c[f];
			c[f]=ch;
		}
			
		
	}
	for (int i=0;i<=c.length;i++) {
		System.out.print(c[i]);
		
	}
	
	}
}
