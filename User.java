import java.util.Scanner;

public class User {
  private float balance = 0;

  User() {
    Scanner input = new Scanner(System.in);
    System.out.println("chcete vas ucet nastavit ako transparentny ? y/n");
    String inputString = input.nextLine().trim().toLowerCase();

    if (inputString.equals("y")) {
      System.out.println("ucet je transparentny");
    } else if (inputString.equals("n")) {
      System.out.println("ucet nie je transparentny");
    }
  }

  void deposit(double deposit) {
    balance += deposit;
    System.out.println("vkladam " + deposit + " eur");
  }

  void withdraw(double withdraw) {
    if (withdraw > balance) {
        throw new IllegalArgumentException("You cant withdraw more than you have on your account");
    }

    balance -= withdraw;
    System.out.println("vyberam " + withdraw + " eur");
  }

  public String balance() {
    return "tvoj zostatok na ucte je " + String.format("%.2f", balance);
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