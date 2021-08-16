public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular; // referência a classe Conta
	//Cliente titular = new Cliente(); -- não seria necessário colocar contaDaMarcela.titular = new Cliente();
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}		
	}
	
	public boolean transfere(double valor, Conta destino) { //Recebe a referência da conta para onde o dinheiro vai
		if(this.saldo >= valor)	 {
			this.saldo -= valor;
			//destino.saldo += valor;
			destino.deposita(valor); // chama o método deposita para a Conta destino
			return true;
		} else {
			return false;
		}
		
		
		
	}
}
