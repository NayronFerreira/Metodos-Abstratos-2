package entidades;

public class Fisica extends TaxaImposto{
	
	private Double gastoSaude;
	
	public Fisica () {
		
		
	}
		

	public Fisica(String nome, Double salarioAnual, Double gastoSaude) {
		super(nome, salarioAnual);
		this.gastoSaude = gastoSaude;
	}




	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public Double taxa() {
		
		double taxaA;
		double salario=getSalarioAnual();
		if (salario<20000) {
			taxaA=(salario/100)*15;
		}
		
		else {if (gastoSaude>=1) {taxaA= (salario/100*25)-(gastoSaude/2);}
		else {taxaA= (salario/100*25);}
		}
		return taxaA;
	}

}
