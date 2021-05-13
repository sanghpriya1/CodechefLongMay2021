import java.util.Scanner;

public class Solubility {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-- > 0) {
				int x =  sc.nextInt();
				int A =  sc.nextInt();
				int B =  sc.nextInt();
				
				int FinalSolubility = 0;
				
				FinalSolubility = ((100-x)*B + A)*10;
				System.out.println(FinalSolubility);
				
				
			}
			sc.close();
		}
}
