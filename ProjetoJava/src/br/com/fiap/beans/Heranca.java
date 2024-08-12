package br.com.fiap.beans;

public class Heranca {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Pedro");
		g.printNome();
		g.calcSalario();
		g.printSalario();
		
		
		Engenheiro e = new Engenheiro();
		e.setNome("Patricia");
		e.printNome();
		e.calcSalario();
		e.printSalario();
		
		Analista a = new Analista();
		a.setNome("Carlos");
		a.printNome();
		a.calcSalario();
		a.printSalario();
		
		Estagiario est = new Estagiario();
		est.setNome("Paulo");
		est.printNome();
		est.calcSalario();
		est.printSalario();
		
			
	}

}
