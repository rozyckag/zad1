package Zad2;

import java.util.Random;
import java.util.Scanner;

public class tablice {
    public static void main(String[] args) {
// --------------------------------------- Zadanie 1.1
        int dzienTygodnia = 3;

        switch (dzienTygodnia) {
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Bledny numer dnia tygodnia");
        }

// ---------------------------------------- Zadanie 1.2
        String miesiac = "Marzec";

        switch (miesiac) {
            case "Grudzien":
            case "Styczen":
            case "Luty":
                System.out.println("Zima");
                break;
            case "Marzec":
            case "Kwiecien":
            case "Maj":
                System.out.println("Wiosna");
                break;
            case "Czerwiec":
            case "Lipiec":
            case "Sierpien":
                System.out.println("Lato");
                break;
            case "Wrzesien":
            case "Pazdziernik":
            case "Listopad":
                System.out.println("Jesien");
                break;
            default:
                System.out.println("Bledna nazwa miesiaca");
        }

// -------------------------------------------- Zadanie 1.3
/*        int liczba1 = 5;
        int liczba2 = 0;
        char operator = '=';
*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe: ");
        int liczba1 = scan.nextInt();

        System.out.println("Podaj druga liczbe: ");
        int liczba2 = scan.nextInt();

        System.out.println("Podaj operator: ");
        char operator = scan.next().charAt(0);

//        int liczba = scan.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Wynik dodawania: " + (liczba1 + liczba2));
                break;
            case '-':
                System.out.println("Wynik odejmowania: " + (liczba1 - liczba2));
                break;
            case '*':
                System.out.println("Wynik mnozenia: " + (liczba1 * liczba2));
                break;
            case '/':
                if (liczba2 != 0)
                    System.out.println("Wynik dzielenia: " + (liczba1 / (float) liczba2));
                else
                    System.out.println("Dzielenie przez zero!");
                break;
            case '%':
                if (liczba2 != 0)
                    System.out.println("Wynik dzielenia modulo: " + (liczba1 % liczba2));
                else
                    System.out.println("Dzielenie przez zero!");
                break;
            default:
                System.out.println("Nieznany operator");
        }

// ------------------------------------- Zadanie 2.1
        int tab[] = new int[3];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(1000);
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

// ------------------------------------- Zadanie 2.2
        int tab2[] = new int[10];
        Random random2 = new Random();

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = random2.nextInt(1000);
        }

        System.out.println("Wartości z pierwszej tablicy:");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + ", ");
        }

        int tab_odrocona[] = new int[10];

        for (int i = 0; i < tab2.length; i++) {
            tab_odrocona[tab_odrocona.length - i - 1] = tab2[i];
        }

        System.out.println("\nWartości z tablicy odwróconej:");
        for (int i = 0; i < tab_odrocona.length; i++) {
            System.out.print(tab_odrocona[i] + ", ");
        }

// ------------------------------------- Zadanie 2.3

        System.out.println("\nPodaj liczbę, którą chcesz sprawdzić czy jest liczbą pierwszą: ");
        int n = scan.nextInt();


        int k = 2;
        if (n > 2) {
            while (k * k <= n) {
                if (n % k == 0) {
                    System.out.println("Liczba " + n + " jest nie liczbą pierwszą");
                    break;
                }

                k++;
            }
        }
        if (k * k > n)
            System.out.println("Liczba " + n + " jest liczbą pierwszą");



        // ------------------------------------- Zadanie 2.4

        int przelicz[][] = new int[10][10];

        for (int i = 0; i < przelicz.length; i++) {
            for (int j = 0; j < przelicz.length; j++) {
               przelicz[i][j] = (i + 1) * (j + 1);
               System.out.print(przelicz[i][j] + " ");
            }
            System.out.print("\n");
        }



        // ------------------------------------- Zadanie 2.5

        System.out.println("Podaj wysokość choinki: ");
        int wysokosc = scan.nextInt();

        char choinka[][] = new char[wysokosc][2*wysokosc-1];

        for (int i = 0; i < choinka.length; i++) {
            for (int j = 0; j < choinka[0].length; j++) {
                choinka[i][j] = ' ';
            }
        }

        for (int i = 0; i < choinka.length; i++) {
            for (int j = wysokosc - 1 - i ; j <= wysokosc - 1 + i; j++) {
                choinka[i][j] = '*';
            }
        }
        for (int i = 0; i < choinka.length; i++) {
            for (int j = 0; j < choinka[0].length; j++) {
                System.out.print(choinka[i][j]);
            }
            System.out.print("\n");
        }


    }

}
