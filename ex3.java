import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do prdouto");
        double valor = s.nextDouble();

        
        if (valor >= 50 && valor < 200) {
            System.out.println("o valor normal é " +valor);
            double newValor = valor - (valor * 0.05);
            System.out.println("o valor com desconto é" +newValor);
        } 
        else if (valor >= 200 && valor < 500 ) {
            System.out.println("o valor normal é" +valor);
            double newValor = valor - (valor * 0.06); 
            System.out.println("o valor com desconto é" +newValor);}

        else if (valor >= 500 && valor < 1000 ) {
            System.out.println("o valor normal é " +valor);
            double newValor = valor - (valor * 0.07); 
            System.out.println("o valor com desconto é" +newValor);

        }
        else if (valor > 1000) {
            System.out.println("o valor normal é " +valor);
            double newValor = valor - (valor * 0.08); 
            System.out.println("o valor com desconto é " +newValor);
    }
    }
}


