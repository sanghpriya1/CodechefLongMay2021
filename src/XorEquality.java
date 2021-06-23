import java.util.Scanner;

public class XorEquality {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while(t-->0) {
					int N =sc.nextInt();
					long f = (int)Math.pow(2, N) % 1000000009;
					f = (f/2) % 1000000009;
					System.out.println( f);
				}
				sc.close();
	}
}

