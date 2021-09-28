import java.util.Scanner;

public class Finanocci {

	public static void main(String[] args) {
		int basamak ,a = 0,b = 1,c=0;

		Scanner k = new Scanner(System.in);
		
		System.out.print("Basamak sayýsýný belirt : ");
		basamak = k.nextInt();

		for (int i = 0; i < basamak; i++) {
			
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
			
			
		}
		
	}

}
