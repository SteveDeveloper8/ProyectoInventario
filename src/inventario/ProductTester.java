package inventario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSize = -1;
        do {
            try {
                System.out.println("*-----------------------------------------*");
                System.out.println("Ingrese el numero que desea agregar: ");
                System.out.print("Introduzca 0 (cero) si no desea agregar productos: ");
                maxSize = in.nextInt();
                if (maxSize < 0) {
                    System.out.println("Valor incorrecto introducido");
                }
            } catch (InputMismatchException z) {
                System.out.println("Tipo de datos incorrecto introducido");
                in.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e);
                in.nextLine();
            }
        } while (maxSize < 0);

        if (maxSize == 0) {
            System.out.println("No se requieren productos.");
        } else {
            Product[] productos = new Product[maxSize];

            for (int i = 0; i < maxSize; i++) {
                in.nextLine();
                //crear variables locales
                int tempNumber;
                String tempName;
                int tempQty;
                double tempPrice;

                //solicitar al usuario que introduzca un número >= cero
                System.out.print("\n\nIntroduzca en nombre del producto: ");
                tempName = in.nextLine();
                System.out.print("Introduzca la cantidad de existencias de este producto: ");
                tempQty = in.nextInt();
                System.out.print("Introduzca el precio de este producto: ");
                tempPrice = in.nextDouble();
                System.out.print("Introduzca el número de elemento ");
                tempNumber = in.nextInt();

                Product p = new Product(tempNumber, tempName, tempQty, tempPrice);
                productos[i] = p;
            }
            for (Product p : productos) {
                System.out.println(p.toString());
            }
                
            
            //Cierra el objeto Scanner 
            in.close();

        }
    }
}
