import java.util.Scanner;

public class Uzytkownik {
    int numerKonta;
    int stanKonta;
    Scanner scanner = new Scanner(System.in);

    public Uzytkownik(int numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public int getNumerKonta() {
        return numerKonta;
    }

    int wyplataZKonta() {
        System.out.println("Wpisz ilość gotówki do wypłaty");
        int wyplata = scanner.nextInt();
        stanKonta -= wyplata;
        return stanKonta;
    }

    int wplataNaKonto() {
        System.out.println("Wpisz ilość gotówki do wpłaty");
        int wyplata = scanner.nextInt();
        stanKonta += wyplata;
        return stanKonta;
    }

    public void interfejsUzytkownika() {
        boolean czyKontynuowac = true;

        while (czyKontynuowac) {
            System.out.println("1.Wyświetl stan konta");
            System.out.println("2.Wpłata");
            System.out.println("3.Wypłata");
            System.out.println("4.Wróć do wyboru konta");

            int wyborUzytkownika = scanner.nextInt();
            switch (wyborUzytkownika) {
                case 1 -> System.out.println(getStanKonta());
                case 2 -> wplataNaKonto();
                case 3 -> wyplataZKonta();
                case 4 -> czyKontynuowac = false;
            }
        }
    }


}
