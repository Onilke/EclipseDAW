
public class TablaMultiplicar {
	
	public static final int MULTIPLE = 5;

	public static void main(String[] args) {
		System.out.println ("Tabla de multiplicar del " + MULTIPLE);
		for(int i=1;i<=10;i++) {
			System.out.println(i+" * " + MULTIPLE + " = " +(i*MULTIPLE));
		}
	}

}
