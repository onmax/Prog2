
public class Triangulo_main{
	public static void main(String [] args){
		Triangulo_obj triangulo;
		triangulo = new Triangulo_obj(25, 25);
		double area = triangulo.area();
		
		System.out.println(triangulo.toString());
		System.out.println(area);
		System.out.println(triangulo.esIgual());
		
	}
}