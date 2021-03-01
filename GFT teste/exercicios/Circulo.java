package exercicios;

public class Circulo implements AreaCalculavel{
	
		public double pi = Math.PI;
		public double raio;
	public Circulo(double pi, double raio) {
		this.pi =pi;
		this.raio= raio;
	}
	@Override
	
	public Double calcular() {
		return pi *(raio*raio);
		
	}

}
