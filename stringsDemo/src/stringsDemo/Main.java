package stringsDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj ="Bugün hava çok güzel.";
		/*System.out.println(mesaj);
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);		
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); //çok kullanılırmış.
		System.out.println(mesaj.lastIndexOf("a"));*/
		
		System.out.println(mesaj.replace(' ','-'));
		System.out.println(mesaj);
		String yenimesaj =mesaj.replace(' ','-');
		System.out.println(yenimesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		//data aramalarında sık sık kullanılır.
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); // metnin başındaki sonundaki boşlukları siler.
		
				
	}

}
