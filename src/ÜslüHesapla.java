import java.util.Scanner;

public class �sl�Hesapla {

	static int Power(int x , int y) {
		if(x==1) {
			return 1; }
		else if (y==0) {
			return 1 ;
		} else {
			return x *Power(x,y-1);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int taban ,�s;
		
		Scanner k = new Scanner(System.in);

		System.out.print("Taban de�erini giriniz : ");
		taban = k.nextInt();
		
		System.out.print("�s de�erini giriniz : ");
		�s = k.nextInt();
		
		System.out.println("Sonu� : " + Power(taban, �s));
	}
	
	

}
