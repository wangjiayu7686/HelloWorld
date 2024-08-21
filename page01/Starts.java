package page01;

public class Starts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalLevel = 10;
		
		//実心のプラミッドを印刷する
		for(int i = 1; i <= totalLevel; i++) {
			for(int k = totalLevel - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		System.out.println("");
		
		//空心のプラミッドを印刷する
		for(int i = 1; i <= totalLevel; i++) {
			for(int k = totalLevel - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				if(j == 1 || j == 2 * i - 1 || i == totalLevel){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			
		}

	}

}
