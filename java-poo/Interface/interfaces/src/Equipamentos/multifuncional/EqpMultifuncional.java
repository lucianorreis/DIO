package Equipamentos.multifuncional;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EqpMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando via eqpt multifuncional");
    }
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via eqpt multifuncional");
    }
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via eqpt multifuncional");
    }
}
