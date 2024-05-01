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

    int escolher () {
        boolean parametro = false;
        int escolha = 0;
        escaneador.nextLine();
        
        while (!parametro) {

            if (this.escolha1.equals(escolha1)) {
                escolha = 1;
                parametro = true;
            }

            else if (this.escolha2.equals(escolha2)) {
                escolha = 2;
                parametro = true;
            }

            else {
                escaneador.nextLine();
            }  

        }

        return escolha;
    }


}
