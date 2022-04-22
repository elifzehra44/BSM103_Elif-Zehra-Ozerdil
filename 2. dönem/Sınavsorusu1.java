
public class Sýnavsorusu1 {

	public static void main(String[] args) {
    String name ="Janet";
    int money = 30;
    Account a =new Account(name,money);
    
    mystery (name,money,a);
    System.out.println(name+","+money+","+a);
    
    money= money+10;
    a.name =" Billy";
    
    mystery(name,money,a);
    System.out.println(name+","+money+","+a);
        
	}
	
	public static  void mystery(String name,int money,Account a) {
		a.money++;
		name="Susan";
		System.out.println(name+","+money+","+a);
		
	}
		}

public class Account{
	String name;
	int money;
	
	public Account(String name ,int money) {
		this.name=name;
		this.money=money;
	} 
	
	public String toString() {
		return name+":$" +money;
		
	}
	}


