
public class Lastword {
	static String s="Ajay is Don ";
//false
	int c=0;
	public static void main(String[] args) {
		
		
		char c []=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==(c.length-1) && c[i]!=' '|| c[i]!=' ' && c[i+1]==' ')
			{
				 c[i]++;
			}
		}
		System.out.println(c);
	}
}
