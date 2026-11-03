package vetor;
import java.util.Scanner;
public class arv {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num[] = new int[3];
		
		for(int i=0;i<num.length;i++) {
		num[i] = teclado.nextInt();
		}
		System.out.println(teste(num));
		
	}
		
		public static int teste(int[] num) {
			int x=0;
			for(int i=0;i<num.length;i++) {
				
			if(num[i]>x) {
				x=num[i];
				System.out.println("Posição " + num[i]);
			}
			}
			
			return x;
		}
	}

