public class Circulo extends Poligono {
	public float Raio;
	
	public Circulo (float raio) {
		this.Raio = raio;
	}
	
	@Override
	public float calcularArea() {
		return (float)Math.PI * this.Raio * this.Raio;
	}

	@Override
	public float calcularPerimetro() {
		return this.Raio * 2;
	}

}
