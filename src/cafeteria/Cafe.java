package cafeteria;

public enum Cafe {
	
	PEQUENO(150,5.00),
	MEDIO(300,7.50),
	GRANDE(500,10.00);
	
	private final int ml;
	private final double preco;
	
	private Cafe(int ml, double preco) {
		this.ml = ml;
		this.preco = preco;
	}
	
	public int getMl() {
		return ml;
	}
	
	public double getPreco() {
		return preco;
	}
	
	
}
