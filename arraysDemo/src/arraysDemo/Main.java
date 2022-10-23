package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ogrenci1 = "Yiğit";
		String ogrenci2 = "Fehmi";
		String ogrenci3 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("-----------------------------");
		String[] ogrenciler = new String[] { "Yiğit", "Fehmi", "Ahmet" };
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------------------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
