package sayıBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false;
		for ( int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
			
		}
		if(varMi) {
			System.out.println("Sayı mevcut.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
		

}
}
