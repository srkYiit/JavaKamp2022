package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'E';
		if(harf=='A'|| harf=='I'|| harf=='O' || harf == 'U') {
			System.out.println("Kalın sesli harf : "+harf);
		}else if(harf=='E'|| harf == 'İ'|| harf=='Ö'||harf=='Ü') {
			System.out.println("İnce sesli harf : "+harf);
		}
		else {
			System.out.println("Geçersiz bir har girdiniz");
		}
	}

}
