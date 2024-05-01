import java.util.Scanner;

public class Capitulo {

// Atributos da classe
    String nome;
    String texto;

    String escolha1;
    String escolha2;

    Personagem persona1;
    Personagem persona2;

    int alteracaoVitalidade;

    Scanner escaneador;

// Construtor
    Capitulo (String nome, String texto, String escolha1, String escolha2, Personagem persona1,
    Personagem persona2, int alteracaoVitalidade, Scanner escaneador) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.persona1 = persona1;
        this.persona2 = persona2;
        this.alteracaoVitalidade = alteracaoVitalidade;
        this.escaneador = escaneador;
    }

    public void mostrar () {
        System.out.println(texto);
        persona1.perdaVitalidade(this.alteracaoVitalidade);       
        persona2.perdaVitalidade(this.alteracaoVitalidade);       
    }

    int escolher() {
        int escolha = 0;
        
        while (escolha != 1 && escolha != 2) {
            System.out.println("Escolha " + escolha1 + " ou " + escolha2 + ": ");
            String entrada = escaneador.nextLine();
            
            if (entrada.equals(escolha1)) {
                escolha = 1;
            } else if (entrada.equals(escolha2)) {
                escolha = 2;
            } else {
                System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }
        
        return escolha;
    }
    
}
