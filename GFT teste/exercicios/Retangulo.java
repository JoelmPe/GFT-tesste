package exercicios;

public class Retangulo  implements AreaCalculavel{
	
	public int altura;
	public int largura;
	
	public Retangulo (int altura, int largura) {
		this.altura = altura;
		this.largura =largura;
		
	}
	
	@Override
	public Double calcular() {
		return(double)largura*altura;
	}

}
