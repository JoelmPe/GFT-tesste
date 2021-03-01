package exercicios;

public class Teste {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(3.14, 16);
		Retangulo retangulo = new Retangulo (180, 260);
		Quadrado quadrado = new Quadrado (20, 30);
		
		System.out.println(quadrado.calcular());
		System.out.println(retangulo.calcular());
		System.out.println(circulo.calcular());
	}

}
