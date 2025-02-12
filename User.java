import java.awt.event.*;
import javax.swing.*;

public class User {
  private float balance = 0;
  private JTextArea textArea;
  private boolean isTransparent;
  private JPanel buttonPanel;
  private JButton yesButton, noButton;
 
  User(JTextArea textArea, JButton yesButton, JButton noButton, JPanel buttonPanel) {
    this.balance = 0;
    this.textArea = textArea;
    this.buttonPanel = buttonPanel;
    this.yesButton = yesButton;
    this.noButton = noButton;
    askTransparency();
  }

  private void askTransparency() {
    textArea.append("chcete vas ucet nastavit ako transparentny ? y/n" + "\n");

  for (ActionListener al : yesButton.getActionListeners()) {
      yesButton.removeActionListener(al);
  }
  for (ActionListener al : noButton.getActionListeners()) {
      noButton.removeActionListener(al);
  }
    yesButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        isTransparent = true;
        buttonPanel.remove(yesButton);
        buttonPanel.remove(noButton);
        buttonPanel.repaint();
        textArea.append("ucet je transparentny" + "\n");
      }
      });

      noButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          isTransparent = false;
          buttonPanel.remove(noButton);
          buttonPanel.remove(yesButton);
          buttonPanel.repaint();
          textArea.append("ucet nie je transparentny" + "\n");
        }
        });

        buttonPanel.removeAll(); 
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        buttonPanel.revalidate();
        buttonPanel.repaint();
  }

  void deposit(double deposit) {
    balance += deposit;
    textArea.append("vkladam " + deposit + " eur" + "\n");
  }

  void withdraw(double withdraw) {
    if (withdraw > balance) {
        throw new IllegalArgumentException("You cant withdraw more than you have on your account");
    }

    balance -= withdraw;
    textArea.append("vyberam " + withdraw + " eur" + "\n");
  }

  void balance() {
    textArea.append("tvoj zostatok na ucte je " + String.format("%.2f", balance) + "\n");
  }

  String list() {  // todo mozno pridat parameter kolko poslednych transakcii vypise alebo to dat natvrdo
    return "vypisujem vsetky transakcie";  // todo pridat LinkedList atd
  }
}

/*
 * uchovavat zoznam vsetkych transakcii pre kazdy ucet napr vklad vyber atd
 */
// todo buttony pre deposit 5 10 50 100 1000 