package exemplos;

public class ex02 {
    public static void main(String[] args) {

        boolean fimDeSemana = false;
        boolean chovendo = false;
        boolean irPraPraia = fimDeSemana && chovendo;

        // && = operador AND
        // || = operador OR

        // System.out.println(irPraPraia);
        if (fimDeSemana == true) {
            System.out.println("Vamos pra praia");
        } else {
            System.out.println("Não vamos pra praia");
        }
    }
}
