package Question2.Tester;

import java.util.Scanner;
import com.Question2.*;


public class Test {
	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner(System.in);
		CIRCLE c1 = new CIRCLE();
		
		try {
			System.out.println("Enyter the diameter :");
			c1.setMyDiameter(sc.nextDouble());
			System.out.println(c1.toString());
			
		} catch (Exception
				e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
		System.out.println("program terminated successfullay");
	}

}
