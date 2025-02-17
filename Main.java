import java.awt.*;
import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Miro Bank");
    JTextArea textArea = new JTextArea(10, 30);
    JScrollPane scrollPane = new JScrollPane(textArea);
    JPanel buttonPanel = new JPanel();
    JButton yesButton = new JButton("Yes");
    JButton noButton = new JButton("No");
    JButton buttonFive = new JButton("5 €");
    JButton buttonTen = new JButton("10 €");
    JButton buttonFifty = new JButton("50 €");
    JButton buttonHundred = new JButton("100 €");
    JButton buttonThousand = new JButton("1000 €");
    JButton buttonDeposit = new JButton("Deposit");
    JButton buttonWithdraw = new JButton("Withdraw");

    BankAccount myAccount = new BankAccount(
      buttonPanel,
      textArea,
      buttonFive,
      buttonTen,
      buttonFifty,
      buttonHundred,
      buttonThousand,
      buttonDeposit,
      buttonWithdraw,
      yesButton,
      noButton
    );

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1920, 1080);
    frame.setLayout(new FlowLayout());
    frame.add(scrollPane);
    frame.add(buttonPanel);

    textArea.setEditable(false);

    frame.add(new JScrollPane(textArea));

    buttonPanel.add(buttonFive);
    buttonPanel.add(buttonTen);
    buttonPanel.add(buttonFifty);
    buttonPanel.add(buttonHundred);
    buttonPanel.add(buttonThousand);

    User user = new User(
      textArea,
      yesButton,
      noButton,
      buttonPanel,
      frame,
      myAccount,
      buttonFive,
      buttonTen,
      buttonFifty,
      buttonHundred,
      buttonThousand,
      buttonDeposit,
      buttonWithdraw
    );
    frame.setVisible(true);
  }
}
// todo pridat vyberanie peniazoch z roznych mien dat kurzy a tak mozno aj cez net to spravit
// ! upravit rozlozenie nech to nevyzera tak zle
// ! pridat tlacidlo spat
