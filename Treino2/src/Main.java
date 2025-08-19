import Personagem.*;
import Personagem.Arqueiro;
import Personagem.Mago;
import Personagem.Ladino;
import Personagem.Guerreiro;

import Inimigos.*;
import Inimigos.Mumias;
import Inimigos.Gnolls;
import Inimigos.Orcs;
import Inimigos.Espectros;


public class Main {
    public static void main(String[] args) {

        Elfo Elfo = new Elfo();
        Elfo.getName();
        Elfo.getIdade();
        Elfo.getRaca();
        Elfo.exibir();

        Arqueiro Arqueiro = new Arqueiro();
        Arqueiro.getName();
        Arqueiro.getIdade();
        Arqueiro.getArma();
        Arqueiro.exibirArqueiro();

        Mago Mago = new Mago();
        Mago.getName();
        Mago.getIdade();
        Mago.getArma();
        Mago.exibirMago();

        Ladino ladino = new Ladino();
        ladino.getName();
        ladino.getIdade();
        ladino.getCaracteristica();
        ladino.exibirLadino();

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.getName();
        guerreiro.getIdade();
        guerreiro.getArma();
        guerreiro.exibirGuerreiro();


        // INIMIGOS

        Mumias mumias = new Mumias();
        mumias.getRaca();
        mumias.getPoder();
        mumias.exibirMumia();

        Gnolls gnolls = new Gnolls();
        gnolls.getRaca();
        gnolls.getPoder();
        gnolls.exibirGnolls();

        Orcs orcs = new Orcs();
        orcs.getRaca();
        orcs.getCaracteristica();
        orcs.exibirOrcs();

        Espectros espectros = new Espectros();
        espectros.getRaca();
        espectros.getCaracteristica();
        espectros.exibirEspectro();

        Hobgoblis hobgoblis = new Hobgoblis();
        hobgoblis.getRaca();
        hobgoblis.getCaracteristica();
        hobgoblis.exibirHobGoblin();

    }
}