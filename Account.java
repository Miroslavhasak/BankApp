import java.util.HashMap;

public class Account {
  private String name;
  private int ID;

  Account() {

  }

  void seeBalance() {  // todo parameter bude id uctu na ktoreho zostatok sa chcem pozriet
    System.out.println("vypisujem zostatok na ucte");
  }

  void accountList() {  // todo pridat return nech vracia list
    System.out.println("ukazujem ti vsetky viditelne ucty");
  }

  HashMap<Integer, String> allAccounts = new HashMap<Integer, String>();
}
/*
 * kazdy ucet ma ID a meno majitela
 ! pouzi HashMap pre ukladanie
 * zostatok na ucte uzivatel moze mat na vyber ci chce povolit nech si to ostatny vedia pozriet
 */