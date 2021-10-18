package tb.soft;

public class Main {

	public static void main(String[] args) {
		String witaj, imie;
		witaj = "Witaj";
		imie = args[0];
		System.out.println(String.format("%s posiadaczu imienia: %s \n",witaj, imie));
		System.exit(0);
	}
}
