import java.util.LinkedList;
import java.util.Queue;

public class Week7ornek3 {

	public static void main(String[] args) {
		

		String data[]= {"Java","php","python","C","c++"};
		
		Queue<String> q=new LinkedList<String>();
		//Set ->add
		//Map ->put
		//push , pop , peek
		for (String word:data){
			q.add(word);
		}
		System.out.println("queue= "+q);
		System.out.println("peek="+q.peek());


	}

}
