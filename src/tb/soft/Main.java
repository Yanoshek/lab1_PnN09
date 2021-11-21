package tb.soft;

public class Main {

	public static void main(String[] args) {
		String witaj, imie;
		witaj = "Witaj";
		imie = args[0];
		System.out.println(String.format("%s posiadaczu imienia: %s \n",witaj, imie));
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%3d",i*j);
			}
			System.out.println("");
		}
		System.exit(0);
	}
}
