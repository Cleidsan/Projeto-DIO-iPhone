import celular.IPhone;
import celular.apps.internet.NavegadorInternet;
import celular.apps.reprodutor.ReprodutorMusical;
import celular.apps.telefonico.AparelhoTelefônico;

public class MeuIPhone {
    public static void main(String[] args) throws Exception {
        IPhone app = new IPhone();

        ReprodutorMusical reprodutorMusical = app;
        NavegadorInternet navegadorInternet = app;
        AparelhoTelefônico aparelhoTelefônico = app;

        // Aparelho Telefônico
        aparelhoTelefônico.ligar();
        aparelhoTelefônico.atender();
        aparelhoTelefônico.iniciarCorreioVoz();

        // Navegador de Internet
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        // Reprodutor Musical
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }
}
