import java.util.Scanner;

public class SwitchInstruction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número entre 1 e 5: ");
		numero = input.nextInt();
		
		switch(numero) {
			case 1:
				System.out.println("Você digitou o número 1!");
				break;
			case 2:
				System.out.println("Você digitou o número 2!");
				break;
			case 3:
				System.out.println("Você digitou o número 3!");
				break;
			case 4:
				System.out.println("Você digitou o número 4!");
				break;
			case 5:
				System.out.println("Você digitou o número 5!");
				break;
			default:
				System.out.println("Você digitou um número inválido");
				
		}
		
		
	}

}
 