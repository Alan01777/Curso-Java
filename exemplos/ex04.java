package exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ex04 {
    public static void main(String[] args) {
       /*  
        String nome = "Alan";
        System.out.println(nome.toUpperCase()); // String em letras maisculas
        System.out.println(nome.toLowerCase()); // String em letras minusculas
        System.out.println(nome.length()); // Quantidade de caracteres na String

        String nome2 = "alan";
        System.out.println(nome.equals(nome2)); // Compara duas Strings e retorna True ou False
        System.out.println(nome.equalsIgnoreCase(nome2)); // Ignora maiusculas e minusculas na comparação
        */
    
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil ));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil );
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        
    }
}
