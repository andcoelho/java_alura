
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		// associa o Cliente paulo a Conta contaDoPaulo
		contaDoPaulo.titular = paulo; // Referência ao objeto contaDoPaulo
									  //tem como parâmetro a referencia ao objeto paulo referenciada em titular
		
		System.out.println(contaDoPaulo.titular.nome); // pegando nome do objeto cliente referenciado no objeto conta;
		System.out.println(contaDoPaulo.titular);
		System.out.println(paulo); // Possui o mesmo endereço de contaDoPaulo.titular, referencia pro mesmo objeto
		
		
		
	}

}
