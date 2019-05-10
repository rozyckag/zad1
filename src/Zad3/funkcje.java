package Zad3;

import java.util.Random;
import java.util.Scanner;

public class funkcje {
        public static void main(String[] args) {


// ------------------ zad. 1

            System.out.print("Liczby podzielne przez 3 lub 5: ");

            for (int i = 1; i <= 100; i++) {
                if (liczbaPodzielnaPrzez3Lub5(i))
                    System.out.print(i + " ");

            }


// ------------------ zad. 2

            Scanner scan = new Scanner(System.in);

            System.out.println("\nPodaj pierwsza liczbe: ");
            int l1 = scan.nextInt();

            System.out.println("Podaj druga liczbe: ");
            int l2 = scan.nextInt();

            System.out.println("Największy wspólny dzielnik liczb " + l1 + " i " + l2 + " to " + nwd(l1, l2));


// ------------------ zad. 3

            System.out.println("\nPodaj liczbe(n!): ");
            int n1 = scan.nextInt();

            System.out.println("Silnia (n!) z liczby " + n1 + " wynosi " + silnia(n1) + "\n");


// ------------------ zad. 4

            int tab[] = new int[10];
            Random random = new Random();

            for (int i = 0; i < tab.length; i++) {
                tab[i] = random.nextInt(1000);
            }

            for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[i] + " ");
            }

            int przesuniecie = 2;
            przesunWPrawo(tab, przesuniecie);

            System.out.println("\nTablica po przesunięciu o " + przesuniecie + " w prawo: ");
            for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[i] + " ");
            }


// ------------------ zad. 5

            System.out.println("\n\nCiag Fibonacciego - Podaj numer elementu ciągu: ");
            int n5 = scan.nextInt();

            System.out.println(n5 + " element ciągu Fibonacciego ma wartość: " + Fibonacci(n5));


// ------------------ zad. 6

            int tab_suma[] = {12, -22, 14, -15, 16, -16};

            System.out.println("\nElementy tablicy: ");

            for (int i = 0; i < tab_suma.length; i++) {
                System.out.print(tab_suma[i] + " ");
            }

            System.out.println("  ->  " + sumaZero(tab_suma));


// ------------------ zad. 7

            System.out.println("\nRysujemy prostokąt \nPodaj dlugosc boku a: ");
            int a = scan.nextInt();

            System.out.println("Podaj dlugosc boku b: ");
            int b = scan.nextInt();

            if (a < 3 || b < 3)
                System.out.println("Podane długości boków są nieprawidłowe - oba boki muszą być większe od 2");
            else
                prostokat(a, b);

        }



//  Funkcje użyte w metodzie Main:

        public static Boolean liczbaPodzielnaPrzez3Lub5(int liczba) {
            Boolean czyPodzielna = false;
            if ((liczba % 3 == 0) || (liczba % 5 == 0))
                czyPodzielna = true;

            return czyPodzielna;
        }

        public static int nwd(int liczba1, int liczba2){
            if (liczba2 == 0)
                return liczba1;
            else
                return nwd(liczba2, liczba1 % liczba2);
        }

        public static int silnia(int n){
            if (n > 0)
                return (n * silnia(n-1));
            else
                return 1;
        }

        static void przesunWPrawo(int[] tab1, int p){
            int pom[] = new int[10];

            for (int i = 0; i < tab1.length; i++) {
                pom[i] = tab1[i];
            }

            for (int i = 0; i < pom.length; i++) {
                int j = (i + p) % pom.length;
                tab1[j] = pom[i];


            }
        }

        public static int Fibonacci(int n){
            int result;
            if(n<3)
                result = 1;
            else
                result = Fibonacci(n-2) + Fibonacci(n-1);

            return result;

        }

        public static boolean sumaZero(int tab[]){
            int pom;

            for (int i = 0; i < tab.length - 1; i++) {
                pom = tab[i];

                for (int i1 = i + 1; i1 < tab.length; i1++) {
                    if ((pom + tab[i1]) == 0)
                        return true;
                }

            }

            return false;
        }


        static void prostokat(int a1, int b1){
            char[][] tab_prostokat = new char[a1][b1];

            for (int i = 0; i < tab_prostokat.length; i++) {
                for (int i1 = 0; i1 < tab_prostokat[0].length; i1++) {
                    tab_prostokat[i][i1] = ' ';
                }
            }

            for (int i = 0; i < tab_prostokat.length; i++) {
                tab_prostokat[i][0] = '#';
                tab_prostokat[i][tab_prostokat[0].length - 1] = '#';

                if (i == 0 || i == tab_prostokat.length - 1)
                    for (int i1 = 1; i1 < tab_prostokat[0].length - 1; i1++) {
                        tab_prostokat[i][i1] = '#';
                    }
            }

            for (int i = 0; i < tab_prostokat.length; i++) {
                for (int i1 = 0; i1 < tab_prostokat[0].length; i1++) {
                    System.out.print(tab_prostokat[i][i1]);
                }
                System.out.print("\n");
            }

        }

}
