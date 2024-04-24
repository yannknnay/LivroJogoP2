import java.util.Scanner;
public class miniProjeto {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);

    // Prólogo e instruções
    System.out.println(
        "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
        "\nNum mundo devastado por um guerra nuclear, a civilização humana entrou em colapso.\n"+
        "Ruínas de antigas cidades e tecnologias do pré-guerra, espalham-se pelo deserto, enquanto facções lutam pelos recursos escassos.\n "+
        "\nUm recurso fundamental para manter-se vivo nesse mundo distópico é a vitalidade.\n"+
        "Representa a energia e resistência do protagonista, é afetada pela fome, sede, exposição a radiação e ferimentos em combate.\n"+
        "Inicialmente, cada protagonista tem 100 pontos de vitalidade.\nContinuar?");
    String continuar = ler.nextLine();


    

    //Início da história (1° capítulo)
    if(continuar.equals("continuar")){
        System.out.println(
            "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
            "\n[...]\nUma figura feminina vaga pela terra árida. Procura por um bunker, há muito tempo construído naquela região por sua facção.\n"+
            "Quando avista o terreno referência do Bunker do Desertor, encontra-o totalmente saqueado.\n"+
            "\nSuas previsões estão em estado crítico, portanto decide entrar."+
            "Assim que entra no bunker a procura de suprimentos, percebe que tem mais alguém dentro, empunha sua arma de tubo"+
            "Porém ao notar o brasão rubro em sua roupa, reconhece um aliado da irmandade da República da Borborema"+
            "\nDecide se apresentar:");
        


        //Criação dos personagens
        String nomeP1 = ler.nextLine();
        Personagem persona1 = new Personagem(nomeP1);
        System.out.println("\nO homem de olhar cruel e corpo esguio arrasta sua perna metálica até " + persona1.verNome() +" e apresenta-se:\n");
        
        String nomeP2 = ler.nextLine();
        Personagem persona2 = new Personagem(nomeP2);
        System.out.println(
            "\nO Bunker do Desertor estava totalmente destruído, os suprimentos foram saqueados"+
            "Mas, ainda havia alguns frascos com água."+
            "\n" + persona2.verNome() + ", supõe que essa água fora deixada como armadilha e possivelmente está contaminada"+
            "Contudo, " + persona1.verNome() + " depois de uma longa caminhada pelo deserto, sente seu corpo implorando por água.\n"+
            "\n" + persona1.verNome() + " deve 'consumir' ou 'não consumir' a água do bunker?");            
        
        String primeiraEscolha = ler.nextLine();



        // Implicações da primeira escolha
        if (primeiraEscolha.equals("consumir")) {
            System.out.println(
                "\n" + persona1.verNome() + " decide consumir a água, ignorando o risco de contaminação."+
                "Após beber a água, " + persona1.verNome() + " sente-se mal e percebe que estava contaminada.");
                persona1.perdaVitalidade(20);
                persona1.verVitalidade();
        } 

        else if (primeiraEscolha.equals("não consumir")) {
            System.out.println(
                "\n" + persona1.verNome() + " decide não consumir a água, optando pela segurança."+
                "Embora ainda sinta sede, " + persona1.verNome() + " sabe que é arriscado beber água desconhecida."+
                "A sede lhe desastibliza um pouco.");
                persona1.perdaVitalidade(5);
                persona1.verVitalidade();
            
        }




        // 2° capítulo (Capítulo noturno)
        System.out.println(
            "\n\n\n---------------------------------------------------------------------------------------------------------------------------------"+
            "\nApós deixar o bunker, " + persona1.verNome() + " e " + persona2.verNome() + " decidem procurar abrigo para a noite."+
            "Eles encontram uma antiga estação de metrô abandonada e decidem passar a noite lá.");

        // Capítulo Noturno
        int capituloNoturno = (int) (Math.random() * 3) + 1; // Gera um número aleatório entre 1 e 3
        switch (capituloNoturno) {
            case 1: // Perda de 10 pontos de vitalidade devido aos danos causados pela tempestade
                System.out.println("\nDurante a noite, eles são surpreendidos por uma tempestade de areia.");
                System.out.println("Eles conseguem se abrigar, mas a tempestade causa danos ao seu abrigo improvisado.");
                persona1.perdaVitalidade(10); 
                persona2.perdaVitalidade(10); 
                persona1.verVitalidade();
                persona2.verVitalidade();
                break;

            case 2: // Perda de 15 pontos de vitalidade devido aos ferimentos do combate
                System.out.println("\nEnquanto dormem, são atacados por um grupo de saqueadores que estava escondido no metrô.");
                System.out.println("Eles conseguem se defender, mas não sem sofrer alguns ferimentos.");
                persona1.perdaVitalidade(15); 
                persona2.perdaVitalidade(15);
                break;

            case 3: // Nenhuma consequência para a vitalidade
                System.out.println("\nA noite passa tranquilamente e eles conseguem descansar.");
            
                break;
        }
    }

    ler.close();
    }
}
