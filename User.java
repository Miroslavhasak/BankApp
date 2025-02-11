import java.util.Scanner;
import javax.swing.JTextArea;

public class User {
  private float balance = 0;
  private JTextArea textArea;

  User(JTextArea textArea) {
    this.balance = 0;
    this.textArea = textArea;

    Scanner input = new Scanner(System.in);
    textArea.append("chcete vas ucet nastavit ako transparentny ? y/n" + "\n");
    String inputString = input.nextLine().trim().toLowerCase();

    if (inputString.equals("y")) {
      textArea.append("ucet je transparentny" + "\n");
    } else if (inputString.equals("n")) {
      textArea.append("ucet nie je transparentny" + "\n");
    }
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
    //return "tvoj zostatok na ucte je " + String.format("%.2f", balance + "\n");
    textArea.append("tvoj zostatok na ucte je " + String.format("%.2f", balance) + "\n");
  }

  String list() {  // todo mozno pridat parameter kolko poslednych transakcii vypise alebo to dat natvrdo
    return "vypisujem vsetky transakcie";  // todo pridat LinkedList atd
  }
}

/*
 * uzivatel moze vkladat peniaze na ucet
 * vyberat peniaze ak to zostatok dovoli
 * zistit zostatok na ucte
 * uchovavat zoznam vsetkych transakcii pre kazdy ucet napr vklad vyber atd
 */
// todo buttony pre deposit 5 10 50 100 1000 