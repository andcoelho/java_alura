
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo);
		
		System.out.println(contaDaMarcela.titular);
		
		//contaDaMarcela.titular.nome = "Marcela"; //titular n�o � referenciado = null;
		//System.out.println(contaDaMarcela.titular.nome);
		
		contaDaMarcela.titular = new Cliente(); //Referencia para titular
		System.out.println(contaDaMarcela.titular);

		contaDaMarcela.titular.nome = "Marcela"; 
		System.out.println(contaDaMarcela.titular.nome);
		
	}

}
