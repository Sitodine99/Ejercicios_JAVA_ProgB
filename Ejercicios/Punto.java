package ProgramacionB;

public class Punto {
	
	// Atributos para las coordenadas x e y
	private double x;
	private double y;
	
	// Constructor para la inicialización de la clase con coordenadas
	public Punto (double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	
	// Métodos para obtener y establecer las coordenadas x e y
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x =x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	// Método para mostrar las coordenadas del punto en un formato legible
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
			

	public static void main(String[] args) {
		
		//Crear un objeto punto
		Punto punto = new Punto(3.5, 2.0);
		
		//Mostrar las coordenadas del punto utilizando el método toString
		System.out.println("Coordenadas del punto: " + punto.toString());
		
		//Establecer nuevas coordenadas para el punto
		punto.setX(1.0);
		punto.setY(4.5);
		
		//Mostrar las nuevas coordenadas del punto
		System.out.println("Nuevas coordenadas del punto: " + punto.toString());
		
		
		

	}

}
