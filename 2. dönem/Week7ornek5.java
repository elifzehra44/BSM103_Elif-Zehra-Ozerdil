import java.util.Scanner;
import java.util.Stack;

public class Week7ornek5 {

	public static void main(String[] args) {
		try (//(a+(b*c)-d) -> dengeli
		       //(a*(d-e)+b   -> dengesiz
		Scanner input = new Scanner(System.in)) {
			System.out.println("kontrol etmek istediðiniz ifadeyi girin:");
			
			String exp= input.next();
			if(isMatching(exp))
				System.out.println("Dengelidir");
			else
				System.out.println("Dengeli deðildir");
		}
		}
	public static boolean isMatching(String exp) {
		
		Stack<Character> s=new Stack<Character>();
		
		for(int i=0; i< exp.length(); i++) {
			
			if(exp.charAt(i)=='(')
				s.push(exp.charAt(i));
			else if (exp.charAt(i)==')')
				if(!s.isEmpty())
					s.pop();
				else
					return false;
		}
		return(s.isEmpty());
	}

}
