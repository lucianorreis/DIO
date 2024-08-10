package edu.luciano.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome = "Luciano";
        String segundoNome = "Reis";

        String NomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(NomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
