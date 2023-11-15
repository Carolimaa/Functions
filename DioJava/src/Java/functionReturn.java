package Java;

public class functionReturn {

	public static void main(String[] args) {
	int resultado = dividir(26, 2);
	System.out.println("\n------------------------------------");
	System.out.println("\nO resultado da divisão é: " + resultado);
	int varFinal = multiplicar(15, 3);
	System.out.println("------------------------------------");
	System.out.println("\nO resultado da multiplicação é: " + varFinal);
	System.out.println("------------------------------------");
	}
public static int multiplicar(int number3, int number4) {
		
		return number3 * number4;
	}
	static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
}