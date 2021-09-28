import java.util.Scanner;

public class KücükBüyük {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner k = new Scanner (System.in);
		System.out.println("Sayýlarý giriniz");
		a=k.nextInt();
		b=k.nextInt();
		c=k.nextInt();
		
		
		if (a<b && a<c) {
			if(b<c) {
				System.out.println(a + "<" + b +"<" +c);
			} else {
				System.out.println(a + "<" + c +"<" +b);
			}
		}
		
		else if (b<a && b<c) {
			if(a<c) {
				System.out.println(b + "<" + a +"<" +c);
			} else {
				System.out.println(b + "<" + c +"<" +a);
			}
		}
		else {
			if(a<b) {
				System.out.println(c + "<" + a +"<" +b);
			} else {
				System.out.println(c + "<" + b +"<" +a);
			}
		}
		

	}

}
