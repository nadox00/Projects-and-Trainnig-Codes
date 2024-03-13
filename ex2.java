import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int numero1, numero2, restodaDivisao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero1 = sc.nextInt();

        System.out.println("Digite outro numero");
        numero2 = sc.nextInt();

        restodaDivisao = numero1 % numero2;
        if (restodaDivisao == 0) {
            System.out.printf("O numero %d eh divisivel por %d!", numero1, numero2);

        } else if (restodaDivisao > 0) {
            System.out.printf("o numero %d não é divisivel por %d" , numero1, numero2);
        }
    }
}
