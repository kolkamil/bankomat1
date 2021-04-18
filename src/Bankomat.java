import java.util.Scanner;

public class Bankomat {
    Scanner scanner = new Scanner(System.in);
    Uzytkownik uzytkownik1= new Uzytkownik(111,1000);
    Uzytkownik uzytkownik2 = new Uzytkownik(222,2000);
    Uzytkownik uzytkownik3 = new Uzytkownik(333,3000);
    Uzytkownik uzytkownik4 = new Uzytkownik(444,4000);

    public void wyborKonta(){
        System.out.println("Wpisz numer konta");
        int wybierzKonto = scanner.nextInt();
        switch(wybierzKonto){
            case 111 -> uzytkownik1.interfejsUzytkownika();
            case 222 -> uzytkownik2.interfejsUzytkownika();
            case 333 -> uzytkownik3.interfejsUzytkownika();
            case 444 -> uzytkownik4.interfejsUzytkownika();
        }
    }


}

