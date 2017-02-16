public class Triangulo_obj{
	double altura, base;	
	
	public Triangulo_obj(double altura, double base) {
		setAltura(altura);
		setBase(base);
	}

	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public void setBase(double base){
		this.base = base;
	}
	
	public String toString(){
		return "[" + base + ", " + altura + "]";
	}
	
	
	public double area(){
		return (base * altura)/2;
	}

	public boolean esIgual(){
		return base == altura;
	}
}