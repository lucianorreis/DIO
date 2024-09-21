package estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;
import Equipamentos.impressora.deskJet;
import Equipamentos.multifuncional.EqpMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EqpMultifuncional em = new EqpMultifuncional();

        deskJet deskJet = new deskJet();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
