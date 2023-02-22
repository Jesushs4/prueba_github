import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cont2 = 0;
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        for (int cont1=1; cont1<=altura; cont1++) {
            System.out.print(" ");
        } System.out.println("*");
        for (int cont1=2; cont1<=altura*2-3; cont1+=2) {
            for (cont2=cont1; cont2<=altura*2-2; cont2+=2) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (cont2=cont1; cont2-2>=1; cont2--) {
                System.out.print(" ");
            } System.out.print("*");
            System.out.println(""); 
        }
        System.out.print(" ");
        for (int cont1=1; cont1<=altura*2-1; cont1++) {
            System.out.print("*");
        }
    }
 }