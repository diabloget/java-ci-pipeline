import java.util.Scanner;

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
class Calculadora{
	int numero1;
	int numero2;
	String operacion;
	Calculadora(int _numero1, int _numero2, String _operacion){
		this.numero1 = _numero1;
		this.numero2 = _numero2;
		this.operacion = _operacion;
		ElegirOperacion(_operacion);
	}
	
	private void ElegirOperacion(String _operacion) {
		if(_operacion.contentEquals("suma")) {
			sumar(this.numero1,this.numero2);
		}else if(_operacion.contentEquals("resta")) {
			restar(this.numero1,this.numero2);
		}else if(_operacion.contentEquals("division")) {
			dividir(this.numero1,this.numero2);
		}else {
			multiplicar(this.numero1,this.numero2);
		}
		
	}

	private void sumar(int num1, int num2) {
		int suma = num1 + num2 ;
		System.out.println(suma);
	}
	
	private void restar(int num1, int num2) {
		int resta = num1-num2;
		System.out.println(resta);
	}
	
	private void dividir(int num1, int num2) {
		int dividir = num1/num2;
		System.out.println(dividir);
	}
	
	private void multiplicar(int num1, int num2) {
		int multiplicar = num1*num2;
		System.out.println(multiplicar);
	}
	
}