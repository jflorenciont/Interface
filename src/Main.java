public class Main {
	
	public static void main(String[] args) {
//		FiguraGeometrica figura = new Retangulo(3, 2);
////		expoeFigura(figura);
//		
//		FiguraGeometrica figura2 = new Circunferencia(3);
////		expoeFigura(figura2);
//		
//		RepositorioDeFiguras repositorio = new RepositorioDeFiguras();
//		repositorio.adicionar(figura);
//		repositorio.adicionar(figura2);
//		
//		repositorio.exporTodas();
//		
//		FiguraGeometrica figura3 = new Retangulo(3, 2);
//		repositorio.remover(figura3);
//		
//		repositorio.exporTodas();
		
		Retangulo ret1 = new Retangulo(3, 2);
		Retangulo ret2 = new Retangulo(3, 3);
		
		System.out.println(ret1.compareTo(ret2));
		
	}

	private static void expoeFigura(FiguraGeometrica figura) {
		System.out.println("Area: " + figura.getArea());
		System.out.println("Perímetro: " + figura.getPerimetro());		
	}

}
