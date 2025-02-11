import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  User user = new User();
	  
	  user.deposit(5.42);
	  user.withdraw(5.34);
	  System.out.println(user.balance());
	  input.close();
	}
}
// todo pridat vyberanie peniazoch z roznych mien dat kurzy a tak mozno aj cez net to spravit
// todo spravit GUI