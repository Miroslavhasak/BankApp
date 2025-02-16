import javax.swing.*;
import java.awt.event.*;

public class BankAccount {
  private float balance = 0;
  private JTextArea textArea;
  private JPanel buttonPanel;
  private JButton buttonFive, buttonTen, buttonFifty, buttonHundred, buttonThousand,buttonDeposit, buttonWithdraw;

BankAccount(JPanel buttonPanel, JTextArea textArea, JButton buttonFive, JButton buttonTen, JButton buttonFifty, 
JButton buttonHundred, JButton buttonThousand, JButton buttonDeposit, JButton buttonWithdraw) {
    this.buttonPanel = buttonPanel;
    this.buttonFive = buttonFive;
    this.buttonTen = buttonTen;
    this.buttonFifty = buttonFifty;
    this.buttonHundred = buttonHundred;
    this.buttonThousand = buttonThousand;
    this.textArea = textArea;
    this.buttonDeposit = buttonDeposit;
    this.buttonWithdraw = buttonWithdraw;
}
  float getBalance() {
    return balance;
  }

  private void depositFive() {
        buttonFive.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            deposit(5);
          }
        });
      }

      private void withdrawFive() {
        buttonFive.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            withdraw(5);
          }
        });
      }

  private void depositTen() {
        buttonTen.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            deposit(10);
          }
        });
      }

      private void withdrawTen() {
        buttonTen.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            withdraw(10);
          }
        });
      }

  private void depositFifty() {
        buttonFifty.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            deposit(50);
          }
        });
      }

      private void withdrawFifty() {
        buttonFifty.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            withdraw(50);
          }
        });
      }

  private void depositHundred() {
        buttonHundred.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            deposit(100);
          }
        });
      }

    private void withdrawHundred() {
        buttonHundred.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            withdraw(100);
          }
        });
      }

  private void depositThousand() {
        buttonThousand.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            deposit(1000);
          }
        });
      }

      private void withdrawThousand() {
        buttonThousand.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            withdraw(1000);
          }
        });
      }

      private void withdraw() {
        buttonWithdraw.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            buttonPanel.remove(buttonWithdraw);
            buttonPanel.remove(buttonDeposit);
            askWithdraw();
          }
        });
      }

      private void deposit() {
        buttonDeposit.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            buttonPanel.remove(buttonWithdraw);
            buttonPanel.remove(buttonDeposit);
            askDeposit();
          }
        });
      }
        
  void askDepositOrWithdraw() {
    textArea.append("Do you want to withdraw or deposit money\n");
    buttonPanel.removeAll();
    buttonPanel.add(buttonWithdraw);
    buttonPanel.add(buttonDeposit);
    withdraw();
    deposit();
    buttonPanel.revalidate();
    buttonPanel.repaint();
    }
      
  void askDeposit() {
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

  void deposit(int deposit) {
    balance += deposit;
    buttonPanel.add(buttonFive);
    buttonPanel.add(buttonTen);
    buttonPanel.add(buttonFifty);
    buttonPanel.add(buttonHundred);
    buttonPanel.add(buttonThousand);
    textArea.append("Your deposit " + deposit + " € was successful" + "\n");
    }

  void askWithdraw() {  //todo moznost pridat podmienku ze minimum urcite maximum atd
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

  void withdraw(int withdraw) {
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
