
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String o=" ";

		String s="Ajay Pawar";
		
		char c[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			o=a+o;
		}
		System.out.println(o);
		
		
	}

}
