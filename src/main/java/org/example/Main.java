package org.example;

import java.util.Scanner;
/*
 Klavyeden katsayıları girilen ax²+bx+c=0 ise 2.dereceden denklemin köklerini a+b+c=0 olması durumunda
 diskriminant hesaplamadan (Sridharacharya formülü) çözen program.
        a: 1
        b: -7
        c: 3
        Kök 1: 6.541381265149109
        Kök 2: 0.45861873485089033
        Sonuç doğrulandı: a + b + c = 0
*/

public class Main {
    public static void main(String[] args) {

        double a, b, c, root1, root2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("İkinci dereceden denklem ax² + bx + c = 0 için katsayıları girin:");
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            // Sridharacharya formülü
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Kök 1: " + root1);
            System.out.println("Kök 2: " + root2);
            if (root1 + root2 == -b / a) {
                System.out.println("Sonuç doğrulandı: a + b + c = 0");
            } else {
                System.out.println("Sonuç doğrulanamadı: a + b + c != 0");
            }
        } else {
            System.out.println("Gerçel kök yoktur, sanal kökler vardır.");
        }
    }
}

