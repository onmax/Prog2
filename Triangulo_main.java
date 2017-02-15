
public class Triangulo_main{
	public static void main(String [] args){
		Triangulo_obj triangulo;
		triangulo = new Triangulo_obj(100, 50);
		double area = triangulo.area();
		
		System.out.println(area);
	}
}