import java.util.Scanner;

public class Main{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.println("Seja bem vindo a Calculadora!");
        System.out.printf("1 - Adição %n2 - Subtracao %n3 - Multiplicacao %n4 - Divisao%n");
        System.out.print("Selecione uma operação para realizar a conta: ");
        int escolha = input.nextInt();
        
        System.out.print("Escolha um numero: ");
        n1 = input.nextInt();
        System.out.print("Escolha outro numero: ");
        n2 = input.nextInt();
        
       switch (escolha) {
        case 1:
            System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
            break;
        case 2:
            System.out.printf("%d - %d = %d", n1, n2, n1 - n2);
            break;
         case 3:
            System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
            break;
         case 4:
            if (n1 == 0 || n2 == 0) {
                System.out.println("Não se divide por 0");
            }else{
            System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
            break;
            }
        }
    
        input.close();
    }
}