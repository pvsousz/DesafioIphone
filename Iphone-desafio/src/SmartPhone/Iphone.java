package SmartPhone;

import Funcionalidades.AparelhoTelefonico.AparelhoTelefonico;
import Funcionalidades.Navegador.Navegador;
import Funcionalidades.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    private String musica;

    @Override
    public void ligar() {
        System.out.println("Ligado...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo.....");
    }

    @Override
    public void iniciarCorreio() {
        System.out.println("Iniciando correio de voz......");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");

    }

    @Override
    public void pausar() {
        System.out.println("Pausado");

    }

    @Override
    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println(musica);
    }

}
