import java.util.Scanner;
public class Exercicio4 {

public static void main(String[]args) {

Scanner entrada = new Scanner(System.in);
double numero1 = entrada.nextDouble();
double numero2 = entrada.nextDouble();

if (numero1 > numero2) {
System.out.println(numero1);
System.out.println(numero2);
} else {
System.out.println (numero2);
    System.out.println(numero1);
}
}
}