package Calculadora;

public class Calculadora {

		int numero1;
		int numero2;
		String operacion;
		
		public Calculadora(int _numero1, int _numero2, String _operacion){
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

		public int sumar(int num1, int num2) {
			int suma = num1 + num2 ;
			System.out.println(suma);
			return suma;
		}
		
		public int restar(int num1, int num2) {
			int resta = num1-num2;
			System.out.println(resta);
			return resta;
		}
		
		public int dividir(int num1, int num2) {
			int dividir = num1/num2;
			System.out.println(dividir);
			return dividir;
		}
		
		public int multiplicar(int num1, int num2) {
			int multiplicar = num1*num2;
			System.out.println(multiplicar);
			return multiplicar;
		}
}
