import java.util.Arrays;
import java.util.Scanner;

public class DiziElamanSiralama {

	public static void main(String[] args) {
		int boyut ;
		int elaman;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Dizinin boyutunu giriniz : ");
		boyut = k.nextInt();
		int [] liste = new int[boyut];
		
		
		System.out.println("Dizinin elamanlarýný giriniz : ");
		while(boyut!=0) {
			for(int i=0;i<liste.length;i++) {
				System.out.print(i+1 + ". Elamaný : ");
				elaman = k.nextInt();
				liste[i]= elaman;
				boyut -- ;
			}
		}
		
		Arrays.sort(liste);
		
		System.out.println(Arrays.toString(liste));
	}
	
}
				
