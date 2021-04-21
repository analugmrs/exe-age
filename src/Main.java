package exercicio_problema;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a sua idade?");
		
		int idade = sc.nextInt();
		
		String adulto = (idade < 18) ?  "você ainda não pode entrar" : "sextou";
		
		System.out.println(adulto);
		
		sc.close();
		
	}

}
