// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String url);
    void atualizarPagina();
}

// Implementação do ReprodutorMusical
class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Música em reprodução.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}

// Implementação do AparelhoTelefonico
class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}

// Implementação do NavegadorInternet
class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo nova aba com página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}

// Classe principal que usa as funcionalidades
public class TelefoneSimulado {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
        NavegadorInternet navegadorInternet = new NavegadorInternetImpl();

        // Usando as funcionalidades
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Música 1");

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina("https://www.exemplo.com");
        navegadorInternet.adicionarNovaAba("https://www.novapagina.com");
        navegadorInternet.atualizarPagina();
    }
}
