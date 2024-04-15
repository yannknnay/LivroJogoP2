import java.util.Scanner;
public class miniProjeto {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
// Ínicio
    System.out.println(
        "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
        "\n[...]\nAs batidas estremeciam a porta, ensurdeciam. Nesse ponto a madeira podre não duraria mais.\n"+
        "\nUm feixe de luz na parade te fez olhar para trás, havia uma janela e, nesse panorama geral, você também nota um lampejo metálico num canto do cômodo, talvez uma faca.\n "+
        "\nNesse momento a porta às suas costas estilhaça.\n"+
        "\n'Saltar pela janela' ou 'pegar faca', o que fazer?'\n");
        
    
    String primeiraEscolha = ler.nextLine();

    if (primeiraEscolha.equals("Saltar pela janela")) {
        System.out.println(
        "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
        "\nEm disparada, salta pela janela. O impacto do seu corpo no vidro é suficiente para despedaça-lo.\n"+
        "\nA queda é brutal, sua perna esquerda serviu de amortecedor. A rapidez com que você chegou ao chão parece ter disfarçado a altura do prédio.\n"+
        "\nMas não há tempo para pensar, latidos de cães aumentam a cada segundo.você já pode vê-los ao longe\n"+
        "\nVocê corre por instinto. Porém há árvores em volta e bastante mato alto\n"+
        "\n'Subir na árvore' mais próxima ou 'entrar no matagal'?\n");
        
        String segundaEscolha = ler.nextLine();
        

        if (segundaEscolha.equals("subir na árvore")) {
            System.out.println(
                "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
                "\nChega até a árvore mais próxima mancando e com o corpo coberto de estilhaçs de vidro.\n"+
                "\nO desafio é insano, mas a onipresença dos latido enche seu corpo de adrenalina e te coloca no primeiro galho.\n"+
                "\nAli, de bruços, você observa os cachorros cercarem a árvore e todo o movimento no prédio, provocado pelo tulmulto dos bichos.\n"+
                "\nA única ação que lhe resta é fechar os olhos e esperar o fim do suplício.");
        }
        

        else if (segundaEscolha.equals("entrar no matagal")) {
            System.out.println(
                "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
                "\nO mato é realmete alto e, pensando bem, você se quer tem forças para caminhar. Subir numa árvore é impensável;\n"+
                "\nEncolhe-se, encurta a respiração. Mas nada disso é suficiente.\n"+
                "\nO rastro rubro deixado por você era nítido para um ofato canino. A selvageria é indescritível.\n"+
                "\nSua carne é devorada por cães.");
        }

        else {
            System.out.println("Escolha inválida!");
        }
    }
      
    else if (primeiraEscolha.equals("pegar faca")) {
        System.out.println(
            "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
            "\nAo tê-la em mãos percebe qua não passa de uma faca de cozinha sem serra\n"+
            "\nMesmo assim, ao precentir que o indivíduo se aproxima por trás, vira-se desferindo-lhem um golpe certeiro na perna,\n"+
            "\nPoderia 'seguir com a luta' ou 'tentar uma fuga'?\n");

            String terceiraEscolha = ler.nextLine();

        if (terceiraEscolha.equals("seguir com a luta")) {
            System.out.println(
                "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
                "\nUm segundo golpe mostra-se tão inútil quanto o primeiro. Uma pancada violenta acerta sua cabeça.\n"+
                "\n[...]\n"+
                "\nCom o desmaio, fica à mercê do perseguidor\n");
        }
        
        else if (terceiraEscolha.equals("tentar uma fuga")) {
            System.out.println(
                "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
                "\nNo momento em que passa pelo que era a porta, seu perseguidor te agarrar.\n"+
                "\nMas não ante de ver o corredor cada vez mais repleto de pessoas uniformaizadas.\n"+
                "\nAgora era evidente, desde do início, fora uma fuga fadada ao fracasso");
        }

        else {
            System.out.println("Escolha inválida!");
        }
    }

    else {
        System.out.println("Escolha inválida!");
    }

    ler.close();
    }
}
