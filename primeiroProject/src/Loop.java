import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacaoFilme = 0;
        double nota = 0;
        int totalDeNotas = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Diga sua avaliação para esse filme");
            nota = leitura.nextDouble();
            mediaAvaliacaoFilme += nota ;
        }


        // ou utilizando o while
        while (nota != -1){
            System.out.println("Diga sua avaliação para esse filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            if (nota != -1){
                mediaAvaliacaoFilme += nota ;
                totalDeNotas ++;

            }

        }

        System.out.println("Média de avaliações " + mediaAvaliacaoFilme / 3);




    }
}
