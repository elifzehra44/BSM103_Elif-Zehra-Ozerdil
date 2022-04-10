import java.util.Stack;

public class Week7ornek1 {

	public static void main(String[] args) {
	
		String data[]= {"Java","php","python","C","c++"};
		
		Stack<String> s=new Stack<String>();
		//Set ->add
		//Map ->put
		//push , pop , peek
		for (String word:data){
			s.push(word);
		}
		System.out.println("Stack = "+s);

	}

}
