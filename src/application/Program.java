package application;

import entities.Esfera;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Esfera esfera = new Esfera();

        System.out.print("Enter Radius: ");
        esfera.radius = sc.nextDouble();
        System.out.print(esfera);
    }
}
