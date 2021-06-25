import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int n,i=0;
		Scanner inp= new Scanner (System.in);
		System.out.println("Sayýyý Giriniz: ");
		n=inp.nextInt();
		
		while (i<=n) {

			if (i%4==0 && i%5==0) {
				System.out.println(i);
			}i++;
		}
	}
}
