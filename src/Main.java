import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;
        while(kontynuuj) {
            bankomat.wyborKonta();
        }
    }


}
