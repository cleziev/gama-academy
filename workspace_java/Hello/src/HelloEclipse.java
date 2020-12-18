import java.util.Scanner;

public class HelloEclipse {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite algum numero");
		
		int a = teclado.nextInt();
		
		System.out.println("Vc digitou "+a);
		
		
		teclado.close();
			
}
}