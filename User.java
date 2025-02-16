import java.awt.event.*;
import javax.swing.*;

public class User {
  private JTextArea textArea;
  private boolean isTransparent;
  private JPanel buttonPanel;
  private JButton yesButton, noButton;
  private JFrame frame;
  private BankAccount bankAcc;

  // konstruktor
  User(JTextArea textArea, JButton yesButton, JButton noButton, 
  JPanel buttonPanel, JFrame frame, BankAccount bankAcc) {
    this.buttonPanel = buttonPanel;
    this.yesButton = yesButton;
    this.noButton = noButton;
    this.frame = frame;
    this.textArea = textArea;
    this.bankAcc = bankAcc;
    askTransparency();
  }

  // prvotne spytanie sa ohladom transparentnosti
  public void askTransparency() {
    textArea.append("Do you want your account to be transparent ? " + "\n");

    yesButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        isTransparent = true;
        buttonPanel.remove(yesButton);
        buttonPanel.remove(noButton);
        textArea.append("Your account is transparent\n");
        bankAcc.askDepositOrWithdraw();
      }
      });

      noButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          isTransparent = false;
          buttonPanel.remove(noButton);
          buttonPanel.remove(yesButton);
          textArea.append("Your account is not transparent\n");
          bankAcc.askDepositOrWithdraw();
        }
        });

        buttonPanel.removeAll(); 
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        buttonPanel.revalidate();
        buttonPanel.repaint();
  }

  String list() {  // todo mozno pridat parameter kolko poslednych transakcii vypise alebo to dat natvrdo
    return "vypisujem vsetky transakcie";  // todo pridat LinkedList atd
  }
}

/*
 * uchovavat zoznam vsetkych transakcii pre kazdy ucet napr vklad vyber atd
 */
 