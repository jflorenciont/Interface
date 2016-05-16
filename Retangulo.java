public class Retangulo implements FiguraGeometrica{

	private double base, altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	
	@Override
	public double getArea() {
		return base * altura;
	}

	@Override
	public double getPerimetro() {
		return 2 * base + 2 * altura;
	}

	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Retangulo){
			Retangulo outroRet = (Retangulo) obj;
			return (base == outroRet.getBase() && altura == outroRet.getAltura());
		}
		return false;
	}


	@Override
	public int compareTo(FiguraGeometrica outroRetangulo) {
		return 0;
	}

}
