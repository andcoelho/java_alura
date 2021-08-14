
public class TesteIR {
	public static void main(String[] args) {

	        double salario = 3300.0;

	        if (salario >=1900.0 && salario <= 2800.0) {
	        	System.out.println("Imposto de 7.5%");
	    }
	        else if (salario >= 2800.01 && salario <= 3751.0){
	        	System.out.println("Imposto de 15%");
	        }
	        else if (salario >= 3751.1 && salario <= 4664.0) {
	        	System.out.println("Imposto de 22.5%");
	        }
	}

}
