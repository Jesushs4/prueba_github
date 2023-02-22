import java.util.Scanner;
public class piramideHueca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pyramid height: ");
        int height = sc.nextInt();
        System.out.print("Enter the character: ");
        char chara = sc.next().charAt(0);
        for (int i=1; i<=height; i++) {
            System.out.print(" ");
        } System.out.println(chara);
        for (int i=2; i<=height*2-3; i+=2) {
            for (int j=i; j<=height*2-2; j+=2) {
                System.out.print(" ");
            }
            System.out.print(chara+" ");
            for (int j=i; j-2>=1; j--) {
                System.out.print(" ");
            } System.out.print(chara);
            System.out.println(""); 
        }
        System.out.print(" ");
        for (int i=1; i<=height*2-1; i++) {
            System.out.print(chara);
        }
    }
}