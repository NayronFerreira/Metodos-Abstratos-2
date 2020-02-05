package entidades;

public class Juridica extends TaxaImposto{
	
	private Integer numeroFuncionarios;
	
	public Juridica () {
		
	}

	public Juridica(String nome, Double taxaAnual, Integer numeroFuncionarios) {
		super(nome, taxaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double taxa() {
		Double taxa;
		double salario = getSalarioAnual();
		if (numeroFuncionarios>10) {
			taxa = salario/100*14;
		}else {taxa = salario/100*16;}
		return taxa;
	}
	
	

}
