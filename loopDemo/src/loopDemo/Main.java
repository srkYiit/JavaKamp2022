package loopDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		//while
		System.out.println("For döngüsü bitti");
		
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
			
		}
		System.out.println("While döngüsü bitti");
		//do while,şart uymasa bile en az bir kere çalışır.
		int j = 100;
		do {
			System.out.println(j);
			j++;
		}
		while(j<=10);
		System.out.println("Do-While döngüsü bitti");
			
	}


	

	

}
