package celular;

import celular.apps.internet.NavegadorInternet;
import celular.apps.reprodutor.ReprodutorMusical;
import celular.apps.telefonico.AparelhoTelefônico;

public class IPhone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet {

    // ReprodutorMusical
    public void tocar() {
        System.out.println("TOCANDO MUSICA PELO MUSIC PLAYER");
    }

    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    public void selecionarMusica() {
        System.out.println("MUSICA SELECIONADA");
    }

    // AparelhoTelefônico
    public void ligar() {
        System.out.println("LIGANDO...");
    }

    public void atender() {
        System.out.println("ATENDENDO A CHAMADA");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // NavegadorInternet
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");

    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void atualizarPagina() {
        System.out.println("PAGINA ATUALIZADA");

    }
}
