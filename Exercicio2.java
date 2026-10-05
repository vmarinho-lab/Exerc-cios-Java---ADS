import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade =leitor.nextInt();
        if(idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
    } 
    }
}
