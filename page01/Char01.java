package page01;

public class Char01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '汪';
		char c4 = 123;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4); //会输出123代表的字符：{
		System.out.println((int)c4);  //123
		System.out.println(c1 + 97);  //194
		
		char c5 = 'b' + 1; //98+1==99
		System.out.println(c5); //c  99对应ASCII编码表的值
		System.out.println((int)c5); //99

	}

}
