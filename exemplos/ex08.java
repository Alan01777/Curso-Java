package exemplos;

public class ex08 {
    public static void main(String[] args) {
        int[] num = { 30, 10, 50, 40, 20 };
        int maior = num[0], menor = num[0], media = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
            } else if (num[i] < menor) {
                menor = num[1];
            }
            media = (media + num[i]) / num.length;
        }
        System.out.println("Maior: " +maior);
        System.out.println("Menor: " +menor);
        System.out.println("Media: " +media);
    }
}
