
public class Anagram {

	public static void main(String[] args) {
		
	
	// TODO Auto-generated method stub
	
	
	

		  String s1="taste";
		String s2="state";
		
		int[]a=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			a[c-97]++;
		}
		
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			a[c-97]--;
		}
		
		for(int i=0;i<26;i++)
		{
			if(a[i]!=0)
			{
				return  false;
			}else
			{
				return true;
			}
		
		}
		}
}		
		
		
	


