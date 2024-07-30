package page01;

public class ForExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//打印1～100之间所有9的倍数的整数，统计个数及总和
		
		int count = 0; //统计9的个数
		int sum = 0; //统计9的倍数的总和
		
		for(int i = 0; i <= 100; i++) {
			if(i % 9 == 0) {
				System.out.println(i);
				count++;
				sum += i;
			}
			
		}
		System.out.println(count);
		System.out.println(sum);
		

	}

}
