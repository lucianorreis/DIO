public class SmartTv {
//* Variáveis */
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
//! Ligar/Desligar TV -----------------------------
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
//! Controle de Volume ----------------------------
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }
    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
    }
//! Controle de Canais -----------------------------
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
