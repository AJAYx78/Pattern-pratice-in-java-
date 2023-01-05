import java.util.Scanner;;
public class box_5X5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{    char c=  (char) (64+n);
			for(int j=1;j<=n;j++)
			{
				System.out.print(c--);
				
				
				
				
			}
			
			
			
			
			
			System.out.println();
		}
	

	}

}
