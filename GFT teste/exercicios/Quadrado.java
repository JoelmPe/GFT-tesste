package exercicios;

public class Quadrado implements AreaCalculavel {
	public int lado1;
	public int lado2;
	
	public Quadrado (int lado1, int lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}
	
	@Override
	public Double calcular() {
		return (double)lado1*lado2;
	}

}
