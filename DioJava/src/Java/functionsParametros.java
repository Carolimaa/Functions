package Java;

public class functionsParametros {

	public static void main(String[] args) {
		torrar("francês","Carol", 10.90);
	}

static void torrar(String pao, String nome, double valor) {
	System.out.println("torrando o pão "+pao);
	System.out.println("preparando o pão "+pao);
	System.out.println("finalizando o pedido de "+ nome);
	System.out.println("Valor total de "+valor );

}
}