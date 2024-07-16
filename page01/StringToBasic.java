package page01;

public class StringToBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2+ " " + s3+ " " + s4);
		
		String s5 = "123";
		//使用基本数据类型对应的包装类的对应方法，得到基本数据类型
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("True");
		short num6 = Short.parseShort(s5);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b);
		
		//取字符串的第一个字符
		System.out.println(s5.charAt(0));
		

	}

}
