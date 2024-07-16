package page01;

public class ForceConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = (int)1.9;
		System.out.println(n1); //1, 造成精度损失
		
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println(b1); //-48，造成数据溢出

	}

}
