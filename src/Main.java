import java.util.Scanner;

import Calculadora.Calculadora;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Que operacion desea realizar: ");
        Scanner sc = new Scanner(System.in);
        String operacion = sc.nextLine();
        
        System.out.println("Inserte el primer numero:");
        int n1 = sc.nextInt();
        
        System.out.println("Inserte el segundo numero:");
        int n2 = sc.nextInt();
        
		Calculadora calculadora = new Calculadora (n1,n2,operacion);
	}

}
