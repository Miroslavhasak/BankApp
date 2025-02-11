import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  JTextArea textArea = new JTextArea();
	  JScrollPane scrollPane = new JScrollPane(textArea);
	  User user = new User(textArea);

	  JFrame frame = new JFrame("Miro Bank");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(1920,1080);
	  frame.add(scrollPane);
	  
	  textArea.setEditable(false);
	  frame.setLayout(new FlowLayout());  

	  JButton yesButton = new JButton("Yes");
	  JButton noButton = new JButton("No");

	  yesButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.append("stlacil si yes" + "\n");
		}
	  });

	  noButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.append("stlacil si no" + "\n");
		}
	  });
	  
	  frame.add(yesButton);
	  frame.add(noButton);
	  frame.setVisible(true);

	  user.deposit(5.42);
	  user.withdraw(5.34);
	  user.balance();
	  input.close();
	}
}
// todo pridat vyberanie peniazoch z roznych mien dat kurzy a tak mozno aj cez net to spravit
// todo spravit GUI
// ! nastavenie transparentnosti uctu ako volbu a nevypisanie ostatnych veci