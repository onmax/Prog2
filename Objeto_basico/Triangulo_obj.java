public class Triangulo_obj{
	double altura, base;
	
	public Triangulo_obj(double x, double y){
		altura = x;
		base = y;
	}
	
	public double area(){
		return (base + altura)/2;
	}
}