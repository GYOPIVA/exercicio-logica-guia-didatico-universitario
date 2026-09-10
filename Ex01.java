import java.util.Scanner;

public class Ex01 {

    public static String verificacaoNome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        while (!nome.matches("[a-zA-ZÀ-ÿ ]+")) {
            System.out.println("Digite seu nome corretamente, somente com letras.");
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
        }
        return nome;
    }

    public static byte verificarIdade() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        byte idade = sc.nextByte();

        while (idade < 0) {
            System.out.println("Digite uma idade válida:");
            idade = sc.nextByte();
        }

        return idade;
    }

    public static byte validarNota() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota:");
        byte nota = sc.nextByte();

        while (nota > 10 || nota < 0) {
            System.out.println("Digite uma nota válida de 0 a 10");
            nota = sc.nextByte();
        }

        return nota;
    }

    public static char verificarMatricula() {
        Scanner sc = new Scanner(System.in);

        System.out.println("O aluno está matriculado? 'S' ou 'N'");
        char matriculado = sc.next().toUpperCase().charAt(0);

        while (matriculado != 'S' && matriculado != 'N') {
            System.out.println("Digite somente S ou N");
            matriculado = sc.next().toUpperCase().charAt(0);
        }

        return matriculado;
    }

    public static void main(String[] args) {

        String nome = verificacaoNome();
        byte idade = verificarIdade();
        byte nota = validarNota();
        char matriculado = verificarMatricula();

        String aprovado = (nota >= 6) ? "Aprovado" : "Reprovado";

        System.out.printf(
                "\nAluno: %s\nIdade: %d\nNota: %d\nMatriculado: %c\nSituação: %s\n",
                nome, idade, nota, matriculado, aprovado
        );
    }
}
