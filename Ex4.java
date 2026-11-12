/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		System.out.print("輸入整數a及b(以空白隔開):");
		try 
		 {
			int a = keyin.nextInt();			
			int b = keyin.nextInt();
			if (b==0)
				throw new ArithmeticException("b=0，無法計算a/b");
			System.out.println(a + "/" + b + "=" + (a / b));
		 } 		
		catch (ArithmeticException e) {
			//取得傳入的錯誤訊息,若無傳入的錯誤訊息，則為預設訊息
			System.out.println("例外狀況原因:" + e.getMessage());
            System.out.println("例外狀況類型: ArithmeticException");
		 }  
		catch (Exception e) {
			System.out.println("例外狀況原因:" + e.getMessage());
		}		
		finally {
			keyin.close();
		 }		 
	}
}