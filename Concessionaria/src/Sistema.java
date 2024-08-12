
public class Sistema {
	protected String nome;
	protected String placa;
	protected double preco;
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	 public double setPreco() {
		 return preco;
	 }
	 
	 public void setPreco(double preco) {
		 this.preco = preco;
	 }
	
	 public void printNome() {
		 System.out.println("Nome: " + this.nome);
	 }
	 public void printPlaca() {
		 System.out.println("Placa: " + this.placa);
	 }
	 
	 public void printPreco() {
		 System.out.println("Preco: " + this.preco);
	 }
	 
	 
	 public void calcPreco() {
		 this.preco = 1000;
	 }

	 public static void main(String[] args) {
		 
		Moto m = new Moto();
		m.setNome("Motoca");
		m.printNome();
		m.calcPreco();
		m.printPreco();
		
		Caminhao c = new Caminhao();
		c.setNome("Caminhao");
		c.printNome();
		c.calcPreco();
		c.printPreco();
		
		Carro ca = new Carro();
		ca.setNome("Carrao");
		ca.printNome();
		ca.calcPreco();
		ca.printPreco();
	 }

}
