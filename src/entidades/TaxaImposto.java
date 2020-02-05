package entidades;

public abstract class TaxaImposto {
	
	private String nome;
	private Double salarioAnual;
	
	public TaxaImposto() {
		
	}

	public TaxaImposto(String nome, Double taxaAnual) {
		super();
		this.nome = nome;
		this.salarioAnual = taxaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioAnual() {
		return salarioAnual;
	}

	public void setTaxaAnual(Double taxaAnual) {
		this.salarioAnual = salarioAnual;
	}
	
	public abstract Double taxa();

}
