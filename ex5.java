import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Marte ou Lua");
        String planeta = s.nextLine();
        System.out.println("digite sua massa corporal");
        double peso = s.nextDouble();

        if (planeta.equals("Marte")) {
            System.out.println("Seu peso em Marte é " +(+peso/9.81)*1.62);
        }

        else if (planeta.equals("Lua")) {
            System.out.println("Seu peso na Lua é " +(peso/9.81)*3.71);
        }
    }
}
