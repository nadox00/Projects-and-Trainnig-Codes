import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = s.nextInt();

        System.out.println("Digite outro Numero");
        int n2 = s.nextInt();

        System.out.println("Digite outro Numero");
        int n3 = s.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println(n2);
        }
        
        else if (n3 > n1 && n3 > n2) {
            System.out.println(n3);
        }


    }
}
