import javax.swing.*;

public class BankAccount {

  private float balance = 0;
  private JTextArea textArea;
  private JPanel buttonPanel;
  private JButton buttonFive, buttonTen, buttonFifty, buttonHundred, buttonThousand, buttonDeposit, buttonWithdraw;
  private Buttons bt;

  BankAccount(
    JPanel buttonPanel,
    JTextArea textArea,
    JButton buttonFive,
    JButton buttonTen,
    JButton buttonFifty,
    JButton buttonHundred,
    JButton buttonThousand,
    JButton buttonDeposit,
    JButton buttonWithdraw,
    JButton yesButton,
    JButton noButton
  ) {
    this.buttonPanel = buttonPanel;
    this.buttonFive = buttonFive;
    this.buttonTen = buttonTen;
    this.buttonFifty = buttonFifty;
    this.buttonHundred = buttonHundred;
    this.buttonThousand = buttonThousand;
    this.textArea = textArea;
    this.buttonDeposit = buttonDeposit;
    this.buttonWithdraw = buttonWithdraw;
    this.bt =
      new Buttons(
        textArea,
        yesButton,
        noButton,
        buttonPanel,
        this,
        buttonFive,
        buttonTen,
        buttonFifty,
        buttonHundred,
        buttonThousand,
        buttonDeposit,
        buttonWithdraw
      );
  }

  public float getBalance() {
    return balance;
  }

  public void askDepositOrWithdraw() {
    textArea.append("Do you want to withdraw or deposit money\n");
    buttonPanel.removeAll();
    buttonPanel.add(buttonWithdraw);
    buttonPanel.add(buttonDeposit);
    bt.withdraw();
    bt.deposit();
    buttonPanel.revalidate();
    buttonPanel.repaint();
  }

  public void deposit(int deposit) {
    balance += deposit;
    buttonPanel.add(buttonFive);
    buttonPanel.add(buttonTen);
    buttonPanel.add(buttonFifty);
    buttonPanel.add(buttonHundred);
    buttonPanel.add(buttonThousand);
    textArea.append("Your deposit " + deposit + " € was successful" + "\n");
  }

  public void withdraw(int withdraw) {
    /*if (withdraw > balance) {
        throw new IllegalArgumentException("You cant withdraw more than you have on your account");
    }*/
    balance -= withdraw;
    buttonPanel.add(buttonFive);
    buttonPanel.add(buttonTen);
    buttonPanel.add(buttonFifty);
    buttonPanel.add(buttonHundred);
    buttonPanel.add(buttonThousand);
    textArea.append("Your withdraw " + withdraw + " € was successful" + "\n");
  }
}
