import java.util.Random;

public class main {

	public static void main(String[] args) {
		Poligono[] poligonos = new Poligono[5];
		Random gerador = new Random();
		float a, b;
		a = gerador.nextInt(99);
		b = gerador.nextInt(99);
		System.out.println("Retangulo");
		System.out.println("   Base: " + a);
		System.out.println(" Altura: " + b);
		poligonos[0] = new Retangulo(a, b);
		
		System.out.println();
		a = gerador.nextInt(99);		
		System.out.println("Quadrado");
		System.out.println(" Lado: " + a);
		poligonos[1] = new Quadrado(a);
		
		System.out.println();
		a = gerador.nextInt(99);		
		System.out.println("Circulo");
		System.out.println(" Raio: " + a);
		poligonos[2] = new Circulo(a);
		
		System.out.println();
		a = gerador.nextInt(99);
		b = gerador.nextInt(99);
		System.out.println("Retangulo");
		System.out.println("   Base: " + a);
		System.out.println(" Altura: " + b);
		poligonos[3] = new Retangulo(a, b);
		
		System.out.println();
		a = gerador.nextInt(99);		
		System.out.println("Circulo");
		System.out.println(" Raio: " + a);
		poligonos[4] = new Circulo(a);
		
		System.out.println("Resultados:");
		for(Poligono pol: poligonos) {			
			System.out.println(pol.getClass().getName());
			System.out.println("     Area:" + pol.calcularArea());
			System.out.println("Perimetro:" + pol.calcularPerimetro());
			System.out.println();
		}			
		
	}

}
