
public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia); 
		System.out.println(primeiraConta.numero); //os atributos iniciam com valor zero.
		
		segundaConta.agencia = 146;
		System.out.println("A segunda conta est� na agencia:" + segundaConta.agencia);

	}

}
