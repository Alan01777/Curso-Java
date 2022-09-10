package exemplos;

public class ex03 {
    public static void main(String[] args) {
        int nota = 80;
        String grade;
        if (nota >= 80) {
            grade = "A";
        } else if (nota < 80 && nota >= 70) {
            grade = "B";
        } else if (nota < 70 && nota >= 60) {
            grade = "C";
        } else if (nota<60 && nota >=50){
            grade="D";
        }else{
            grade = null;
        }

        switch (grade){
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Grade inválida");
                break;
        }
    }
}
