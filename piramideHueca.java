import java.util.Scanner;
//XD
//comentarioPrueba
public class piramideHueca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Se introduce la altura de la pirámide
        System.out.print("Enter the pyramid height: ");
        int height = sc.nextInt();
        // Se introduce el caracter que se desea utilizar
        System.out.print("Enter the character: ");
        char chara = sc.next().charAt(0);
        // Pinta la pirámide menos la última fila
        for (int i=1; i<=height; i++) {
            System.out.print(" ");
        for (int i=1; i<=height; i++) { //top part
            System.out.print("a ");
        } System.out.println(chara);
        for (int i=2; i<=height*2-3; i+=2) { // body
            for (int j=i; j<=height*2-2; j+=2) {
                System.out.print(" ");
            }
            System.out.print(chara+" ");
            for (int j=i; j-2>=1; j--) {
                System.out.print(" ");
            } System.out.print(chara);
            System.out.println(""); 
        }
        //Pinta la fila final
        System.out.print(" ");
        for (int i=1; i<=height*2-1; i++) { // bottom part
            System.out.print(chara);
        }
    }
}
