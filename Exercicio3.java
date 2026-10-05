import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        if (numero1 == numero2) {
        System.out.println("Números iguais");
        } else  {
            if (numero1 > numero2){
                System.out.println(numero1 - numero2);
            } else {
                System.out.println(numero2 - numero1);
            }
        }
}
}
   