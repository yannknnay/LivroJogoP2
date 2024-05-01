public class Personagem {
    
    String nome;
    int vitalidade;

    // Construtor
    Personagem(String nome) {
        this.nome = nome;
        this.vitalidade = 100;
    }


    // Perda de vitalidade
    public int perdaVitalidade (int perda) {
        this.vitalidade -= perda;
        if (vitalidade < 0) {
            vitalidade = 0;
        } 
        return vitalidade;
    }

    // Visualizador de vitalidade
    public void verVitalidade() {
        System.out.println("\nA vitalidade de " + this.nome + " é " + this.vitalidade + " pontos.");
    }
}
