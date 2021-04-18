import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;
        bankomat.wyborKonta();

        while(kontynuuj) {
            System.out.println("Czy chcesz zakończyć działanie? \n 1.Tak \n 2.Nie");
            int wybor = scanner.nextInt();
            switch(wybor){
                case 1 -> kontynuuj = false;
                case 2 ->  bankomat.wyborKonta();
            }
        }
    }


}
