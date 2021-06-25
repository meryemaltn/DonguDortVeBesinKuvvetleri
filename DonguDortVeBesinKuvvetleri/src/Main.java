import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int n,i=1;
		Scanner inp= new Scanner (System.in);
		System.out.println("Sayýyý Giriniz: ");
		n=inp.nextInt();
		
		for (i=1 ; i<=n ; i*=4) {
			System.out.println(i);
		}
		
		for (i=5 ; i<=n ; i*=5) {
			System.out.println(i);
		}
		}
	}
