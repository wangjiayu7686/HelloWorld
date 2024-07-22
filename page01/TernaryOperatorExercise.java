package page01;

public class TernaryOperatorExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 234;
		int n2 = 2234;
		int n3 = 2134;
		
//		int max1 = n1 > n2 ? n1 : n2;
//		int max2 = n3 > max1 ? n3 : max1;
		
		//一句话实现
		int max = (n1 > n2 ? n1 :n2) > n3 ? (n1 > n2 ? n1 :n2) : n3;
		
		System.out.println(max);
		

	}

}
