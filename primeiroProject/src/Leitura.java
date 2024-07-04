import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme Favorito:");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para esse filme");
        double avaliacaoFilme = leitura.nextDouble();


        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacaoFilme);
    }
}
