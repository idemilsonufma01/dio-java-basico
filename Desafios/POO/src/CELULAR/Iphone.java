package CELULAR;

import FUNCIONALIADADES.AparelhoTelefonico.AparelhoTelefonico;
import FUNCIONALIADADES.NavegadorInternet.NavegadorInternet;
import FUNCIONALIADADES.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

  public void ligar(String numero) {
    System.out.println("Ligando via Iphone");
  }

  public void atender() {
    System.out.println("Atendendo via Iphone");
  }

  public void iniciarCorreioVoz() {
    System.out.println("iniciando correio de voz via Iphone");
  }

  public void exibirPagina(String url) {
    System.out.println("Exibindo Pagina web via Iphone");
  }

  public void adicionarNovaAba() {
    System.out.println("Adicionando nova Aba via Iphone");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando Pagina Web via Iphone");
  }

  public void tocar() {
    System.out.println("Tocando Musica via Iphone");
  }

  public void pausar() {
    System.out.println("Pausando Musica via Iphone");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Selecionando Musica via Iphone");

  }

  public static void main(String[] args) {
    Iphone iphone = new Iphone();
    // Testando Reprodutor Musical
    iphone.selecionarMusica("minha musica");
    iphone.tocar();
    iphone.pausar();

    // Testando Aparelho Telefônico
    iphone.atender();
    iphone.ligar("2000-9876");
    iphone.iniciarCorreioVoz();

    // Testando Navegador de Internet
    iphone.exibirPagina("www.google.com");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
  }
}
