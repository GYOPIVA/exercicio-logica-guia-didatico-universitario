import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int segundoNumero = sc.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;
        int restante = primeiroNumero % segundoNumero;

        System.out.printf("A soma dos numeros Digitados é %d: \nA subtração dos numeros Digitados é %d: \n" +
                "A multiplicação dos numeros Digitados é %d: \nA divisão dos numeros Digitados é %d: \n" +
                "O restante dos numeros Digitados é %d: \n",soma, subtracao,multiplicacao,divisao,restante);
    }
}
