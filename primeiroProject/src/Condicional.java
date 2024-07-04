public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2015;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal"; // normal ou plus

        if (anoDeLancamento >= 2022){
            System.out.println("lançamento que os clients estão gostando!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){ // && as duas condicionais validando
            System.out.println("Filme Liberado");
        } else{
            System.out.println("Deve pagar a locação do filme");
        }
    }
}
