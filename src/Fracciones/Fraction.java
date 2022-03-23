package Fracciones;

public class Fraction {
	// Atributos
	long numerator, denominator;
	// Constructores
	Fraction(){
		this(0,1);
	}
	Fraction(final long n){
		this(n,1);
	}
	Fraction(long n,long d){
		// si d = 0 -> lanzar IllegalArgumentException
		if(d == 0) throw new IllegalArgumentException("not valid 0 value in denominator");
		// hay que hacerlo irreducible en un metodo privado aparte
		simplize(n,d);
		// establecer el valor negativo en el numerador
		
		numerator = n;
		denominator = d;
	}
	Fraction(double f){
		System.out.println("Falta");
	}
	Fraction(String s){
		// Mirar apartado 3
		// s = "#" o "#/#"
		// si s no es una fraccion -> lanzar NumberFormatException 
		System.out.println("Falta");
		parseFraction(s);
	}
	// Métodos Públicos
	long getNumerator() {
		return numerator;
	}
	
	long getDenominator() {
		return denominator;
	}
	 // Comprobar que son irreducible
	void setNumerator(long n) {	
		numerator = n;
	}
	
	void setDenominator(long d) {
		denominator = d;
	}
	
	void setFraction(Fraction f) {
		numerator = f.getNumerator();
		denominator = f.getDenominator();
	}
	
	void changeSign() {
		numerator *= -1;
	}
	
	String toString() {
		String output = "" + numerator;
		if(denominator != 1) output += "/"+ denominator;
		return output;
	}
	// Métodos Privados
	private Fraction parseFraction(String s) {
		System.out.println("Falta");
		return null;
	}
	// Hace la fraccion irreducible
	private void simplize(long n, long d) {
		// dividir ambos entre el maximo comun dividor
	}
	// Deja el valor negativo (si lo hay) en el numerador
	private void normalize(long n, long d) {
		if(d < 0 && n >= 0) {
			d *= -1;
			n *= -1;
		}
	}
}
