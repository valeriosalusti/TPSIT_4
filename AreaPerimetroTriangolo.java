package areaperimetrotriangolo;

import java.util.Scanner;

public class AreaPerimetroTriangolo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float L1, L2, base, h, area, perimetro;
        System.out.println("Inserisci il lato 2");
        L2 = input.nextFloat();
        System.out.println("Inserisci la base");
        base = input.nextFloat();
        do {
            System.out.println("Inserisci il lato 1");
            L1 = input.nextFloat();
        } while (L1 <= 0 || (L1 > L2 + base));
        System.out.println("Inserisci l'altezza");
        h = input.nextFloat();
        area=base*h/2;
        perimetro=base+L1+L2;
        System.out.println("\n Il perimetro è:" + perimetro);
        System.out.println("\n L'area è:" +area);
    }

}
