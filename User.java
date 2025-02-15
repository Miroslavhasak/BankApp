import java.awt.event.*;
import javax.swing.*;

public class User {
  private float balance = 0;
  private JTextArea textArea;
  private boolean isTransparent;
  private JPanel buttonPanel;
  private JButton yesButton, noButton, buttonFive, buttonTen, buttonFifty, buttonHundred, buttonThousand;
  private JFrame frame;
 

  // konstruktor
  User(JTextArea textArea, JButton yesButton, JButton noButton, JPanel buttonPanel, JButton buttonFive, 
  JButton buttonTen, JButton buttonFifty, JButton buttonHundred, JButton buttonThousand, JFrame frame) {
    this.balance = 0;
    this.textArea = textArea;
    this.buttonPanel = buttonPanel;
    this.yesButton = yesButton;
    this.noButton = noButton;
    this.buttonFive = buttonFive;
    this.buttonTen = buttonTen;
    this.buttonFifty = buttonFifty;
    this.buttonHundred = buttonHundred;
    this.buttonThousand = buttonThousand;
    this.frame = frame;
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
        //buttonPanel.repaint();
        textArea.append("Your account is transparent\n");
        askDeposit();
      }
      });

      noButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          isTransparent = false;
          buttonPanel.remove(noButton);
          buttonPanel.remove(yesButton);
          //buttonPanel.repaint();
          textArea.append("Your account is not transparent\n");
          askDeposit();
        }
        });

        buttonPanel.removeAll(); 
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        buttonPanel.revalidate();
        buttonPanel.repaint();
  }







private void depositFive() {
  buttonFive.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      deposit(5);
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
private void depositFifty() {
  buttonFifty.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      deposit(50);
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
private void depositThousand() {
  buttonThousand.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      deposit(1000);
    }
  });
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

  void deposit(double deposit) {
    balance += deposit;
    buttonPanel.add(buttonFive);
    buttonPanel.add(buttonTen);
    buttonPanel.add(buttonFifty);
    buttonPanel.add(buttonHundred);
    buttonPanel.add(buttonThousand);
    textArea.append("Your deposit " + deposit + " € was successful" + "\n");
  }

  void withdraw(double withdraw) {
    if (withdraw > balance) {
        throw new IllegalArgumentException("You cant withdraw more than you have on your account");
    }

    balance -= withdraw;
    textArea.append("vyberam " + withdraw + " €" + "\n");
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
 