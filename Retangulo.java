public class Retangulo extends Poligono {
	private float Base;
	private float Altura;
	
	public Retangulo (float base, float altura)	{		
		this.Base = base;
		this.Altura = altura;
	}
	
	@Override
	public float calcularArea() {
		return this.Base * this.Altura;
	}

	@Override
	public float calcularPerimetro() {
		return (this.Base * 2) + (this.Altura * 2);
	}

}
