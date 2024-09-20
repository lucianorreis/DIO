package MSN;

import java.util.Locale;
import java.util.Scanner;

public class ComputadorPedrinho{
    public static void main(String[] args) throws AssertionError {
        try 
        (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {
            int entrada;

            //* abrindo MSN Messenger */
            System.out.println("- - - - - M S N - - - - -");
            System.out.println("MENU: ");
            System.out.println("1 - Enviar Mensagem");
            System.out.println("");

            System.out.println("Digite aqui: ");
                entrada = scan.nextInt();

            //* Controle de Entrada de Dados */

            MSN msn = new MSN();

            switch (entrada) {
                case (1) -> //Envia mensagem
                    msn.enviarMensagem();
                default -> throw new AssertionError();
            }
        }


    }
}