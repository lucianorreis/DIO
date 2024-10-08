import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    //* Método principal da aplicação
    public static void main(String[] args) {
        //? Define o número de vagas a serem preenchidas
        int numeroVagas = 5; 
        //? Chama o método que realiza a seleção dos candidatos
        selecaoCandidatos(numeroVagas);

        String [] candidatos = {"JOAO", "MARCIA", "DORIA", "JOHN", "MARIA"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do { 
            //elas precisarão sofrer alterações
            
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +" NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas);

    }

    //* Método Auxiliar
        static boolean atender(){
            return new Random().nextInt(3) == 1;
        }

    static void imprimirSelecionados(){
        String [] candidatos = {"JOAO", "MARCIA", "DORIA", "JOHN", "MARIA"};
        
        System.out.println("Imprimindo a lista informando o indice do elemento");
        
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação");
        
        for(String candidato : candidatos) {
            System.out.println("O candidato é selecionado foi " + candidato);
        }
    }

    //* Método responsável por realizar a seleção dos candidatos
    static void selecaoCandidatos(int numeroVagas) {
        //? Array de strings contendo os nomes dos candidatos
        String[] candidatos = {
                "JOAO", "MARCIA", "DORIA", "JOHN", "MARIA",
                "JOSEFINA", "ANA", "LORENA", "ADAMANTINA", "PAN"
        };

        //* Contador para acompanhar o número de candidatos selecionados
        int candidatosSelecionados = 0;
        //? Salário base da vaga
        double salarioBase = 2000.0;

        //* Itera sobre cada candidato do array
        for (String candidato : candidatos) {

            //? Gera um valor aleatório para o salário pretendido do candidato
            double salarioPretendido = valorPretendido();

            //? Imprime na console o candidato e seu salário pretendido
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            //?  Analisa o candidato com base no salário pretendido e no salário base
            analisarCandidato(candidato, salarioPretendido, salarioBase);

            //? Verifica se o candidato pode ser selecionado e incrementa o contador se necessário
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            //? Verifica se o número de vagas já foi preenchido e interrompe o loop se necessário
            if (candidatosSelecionados >= numeroVagas) {
                break;
            }
        }
    }

    //* Método para gerar um valor aleatório para o salário pretendido do candidato
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //* Método para analisar o candidato com base no salário pretendido e no salário base
    static void analisarCandidato(String candidato, double salarioPretendido, double salarioBase) {

        //? Verifica as condições e imprime mensagens correspondentes
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO " + candidato);
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO " + candidato + " PARA NEGOCIAR");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS PARA " + candidato);
        }
    }
}

// import java.util.concurrent.ThreadLocalRandom;

// public class ProcessoSeletivo {
//     public static void main(String[] args) {
//     }

//     static void selecaoCandidatos() {
//         String [] candidatos = {
//             "JOAO",
//             "MARCIA",
//             "DORIA",
//             "JOHN",
//             "MARIA",
//             "JOSEFINA",
//             "ANA",
//             "LORENA",
//             "ADAMANTINA",
//             "PAN"
//         };

//         int candidatosSelecionados = 0;
//         int candidatoAtual = 0;
//         double salarioBase = 2000.0;

//         while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
//             String candidato = candidatos[candidatoAtual];
//             double salarioPretendido = valorPretendido();

//             System.out.println("O candidato " + candidato + " solicitou este valor de salário" + salarioPretendido);

//             if(salarioBase >= salarioPretendido) {
//                 System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
//                 candidatosSelecionados++;
//             }
//             candidatoAtual++;
//         }
//     }

//     static double valorPretendido() {
//         return ThreadLocalRandom.current().nextDouble(1800, 2200);
//     }

//     static void analisarCandidato(double salarioPretendido) {
//       double salarioBase = 2000.0;
//         if (salarioBase > salarioPretendido) {
//             System.out.println("LIGAR PARA O CANDIDATO");
//         } else if(salarioBase == salarioPretendido) {
//             System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
//         } else {
//             System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
//         }
//     }
// }