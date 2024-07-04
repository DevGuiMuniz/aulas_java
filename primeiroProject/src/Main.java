//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esse é o Screen Match");

        System.out.println("Filme: Divertidamente");

        int anoDeLancamento = 2015;
        System.out.println("O ano de lançamento:"  +  anoDeLancamento);
        boolean incluidoNoPlano = true;
        double media = (9.9 + 7.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme da Disney
                Filme das emoções que estão presente no nosso dia a dia.
                ano de lançamento
                """ + anoDeLancamento ;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);



    }
}