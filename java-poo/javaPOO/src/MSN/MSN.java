package MSN;

public class MSN{
  private void validarInternet(){
    System.out.println("Validando Conexão. . .");
    for (int i = 5; i > 0; i--){
        System.out.println(i + "...");
        if (i == 1) {
        System.out.println("Conexão Bem sucedida!");
        }
    } 
  }

  public void enviarMensagem(){
    System.out.println("- - - - - PROCESSANDO - - - - - - - ");

    validarInternet();
    receberMensagem();
    salvarHistorico();

        
  }

  private void salvarHistorico(){
    System.out.println("Histórico Salvo!");
  }

  private void receberMensagem() {
    System.out.println("Sistema: Fim da simulação");
  }
}