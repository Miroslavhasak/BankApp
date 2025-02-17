import java.awt.event.*;
import javax.swing.*;

public class Buttons {

  private JButton yesButton, noButton, buttonFive, buttonTen, buttonFifty, buttonHundred, buttonThousand, buttonDeposit, buttonWithdraw;
  private JTextArea textArea;
  private JPanel buttonPanel;
  private BankAccount bankAcc;
  private boolean isTransparent;
  private final int FIVE = 5;
  private final int TEN = 10;
  private final int FIFTY = 50;
  private final int HUNDRED = 100;
  private final int THOUSAND = 1000;

  Buttons(
    JTextArea textArea,
    JButton yesButton,
    JButton noButton,
    JPanel buttonPanel,
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
    this.bankAcc = bankAcc;
    this.buttonFive = buttonFive;
    this.buttonTen = buttonTen;
    this.buttonFifty = buttonFifty;
    this.buttonHundred = buttonHundred;
    this.buttonThousand = buttonThousand;
    this.buttonDeposit = buttonDeposit;
    this.buttonWithdraw = buttonWithdraw;
  }

  public void yesButton() {
    yesButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          isTransparent = true;
          buttonPanel.remove(yesButton);
          buttonPanel.remove(noButton);
          textArea.append("Your account is transparent\n");
          bankAcc.askDepositOrWithdraw();
        }
      }
    );
  }

  public void noButton() {
    noButton.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          isTransparent = false;
          buttonPanel.remove(noButton);
          buttonPanel.remove(yesButton);
          textArea.append("Your account is not transparent\n");
          bankAcc.askDepositOrWithdraw();
        }
      }
    );
  }

  public void depositFive() {
    buttonFive.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.deposit(FIVE);
        }
      }
    );
  }

  public void depositTen() {
    buttonTen.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.deposit(TEN);
        }
      }
    );
  }

  public void depositFifty() {
    buttonFifty.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.deposit(FIFTY);
        }
      }
    );
  }

  public void depositHundred() {
    buttonHundred.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.deposit(HUNDRED);
        }
      }
    );
  }

  public void depositThousand() {
    buttonThousand.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.deposit(THOUSAND);
        }
      }
    );
  }

  public void deposit() {
    buttonDeposit.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          buttonPanel.remove(buttonWithdraw);
          buttonPanel.remove(buttonDeposit);
          askDeposit();
        }
      }
    );
  }

  public void askDeposit() {
    textArea.append("How much money u want to deposit\n");
    buttonPanel.removeAll();
    buttonPanel.add(buttonFive);
    buttonPanel.add(buttonTen);
    buttonPanel.add(buttonFifty);
    buttonPanel.add(buttonHundred);
    buttonPanel.add(buttonThousand);
    depositFive();
    depositTen();
    depositFifty();
    depositHundred();
    depositThousand();
    buttonPanel.revalidate();
    buttonPanel.repaint();
  }

  public void withdrawFive() {
    buttonFive.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.withdraw(FIVE);
        }
      }
    );
  }

  public void withdrawTen() {
    buttonTen.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.withdraw(TEN);
        }
      }
    );
  }

  public void withdrawFifty() {
    buttonFifty.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.withdraw(FIFTY);
        }
      }
    );
  }

  public void withdrawHundred() {
    buttonHundred.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.withdraw(HUNDRED);
        }
      }
    );
  }

  public void withdrawThousand() {
    buttonThousand.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          bankAcc.withdraw(THOUSAND);
        }
      }
    );
  }

  public void withdraw() {
    buttonWithdraw.addActionListener(
      new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          buttonPanel.remove(buttonWithdraw);
          buttonPanel.remove(buttonDeposit);
          askWithdraw();
        }
      }
    );
  }

  public void askWithdraw() { //todo moznost pridat podmienku ze minimum urcite maximum atd
    textArea.append("How much money u want to withdraw\n");
    buttonPanel.removeAll();
    buttonPanel.add(buttonFive);
    buttonPanel.add(buttonTen);
    buttonPanel.add(buttonFifty);
    buttonPanel.add(buttonHundred);
    buttonPanel.add(buttonThousand);
    withdrawFive();
    withdrawTen();
    withdrawFifty();
    withdrawHundred();
    withdrawThousand();
    buttonPanel.revalidate();
    buttonPanel.repaint();
  }
}
