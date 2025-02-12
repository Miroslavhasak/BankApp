import java.awt.*;
import javax.swing.*;
public class Main
{
	public static void main(String[] args) {

	  JFrame frame = new JFrame("Miro Bank");
	  JTextArea textArea = new JTextArea(10,30);
	  JScrollPane scrollPane = new JScrollPane(textArea);
	  JPanel buttonPanel = new JPanel();
	  JButton yesButton = new JButton("Yes");
	  JButton noButton = new JButton("No");

	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(1920,1080);
	  frame.setLayout(new FlowLayout());  
	  frame.add(scrollPane);
	  frame.add(buttonPanel);
	  
	  textArea.setEditable(false);
	  
	  frame.add(new JScrollPane(textArea));

	  User user = new User(textArea, yesButton, noButton, buttonPanel);

	  frame.setVisible(true);
	}
}
// todo pridat vyberanie peniazoch z roznych mien dat kurzy a tak mozno aj cez net to spravit
// ! nastavit to ze sa objavi nova vyzva na vyber a vklad penazi pomocou buttonov