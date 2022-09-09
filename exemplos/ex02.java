package exemplos;

public class ex02 {
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean chovendo = false;
        boolean irPraPraia = fimDeSemana && chovendo;

        // && = operador AND
        // || = operador OR 

        System.out.println(irPraPraia);
    }
}
