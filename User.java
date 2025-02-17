import javax.swing.*;

public class User {

  private JTextArea textArea;
  private boolean isTransparent;
  private JPanel buttonPanel;
  private JButton yesButton, noButton;
  private Buttons bt;

  // konstruktor
  User(
    JTextArea textArea,
    JButton yesButton,
    JButton noButton,
    JPanel buttonPanel,
    JFrame frame,
    BankAccount bankAcc,
    JButton buttonFive,
    JButton buttonTen,
    JButton buttonFifty,
    JButton buttonHundred,
    JButton buttonThousand,
    JButton buttonDeposit,
    JButton buttonWithdraw
  ) {
    this.buttonPanel = buttonPanel;
    this.yesButton = yesButton;
    this.noButton = noButton;
    this.textArea = textArea;
    this.bt =
      new Buttons(
        textArea,
        yesButton,
        noButton,
        buttonPanel,
        bankAcc,
        buttonFive,
        buttonTen,
        buttonFifty,
        buttonHundred,
        buttonThousand,
        buttonDeposit,
        buttonWithdraw
      );
    askTransparency();
  }

  public void askTransparency() {
    textArea.append("Do you want your account to be transparent ? " + "\n");
    bt.yesButton();
    bt.noButton();

    buttonPanel.removeAll();
    buttonPanel.add(yesButton);
    buttonPanel.add(noButton);
    buttonPanel.revalidate();
    buttonPanel.repaint();
  }

  String list() { // todo mozno pridat parameter kolko poslednych transakcii vypise alebo to dat natvrdo
    return "vypisujem vsetky transakcie"; // todo pridat LinkedList atd
  }
}
/*
 * uchovavat zoznam vsetkych transakcii pre kazdy ucet napr vklad vyber atd
 */
