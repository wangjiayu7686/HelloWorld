package page01;

public class ForceConvertDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x = (int)10*3.5+6*1.5; //unpass
		
		//强转符号只针对最近操作数有效，提升优先级用小括号
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x); 

	}

}
