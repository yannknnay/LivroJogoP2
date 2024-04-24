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

    // Ganho de vitalidade
    public int aumentarVitalidade (int aumento) {
        this.vitalidade += aumento;
        if (vitalidade > 200) {
            vitalidade = 200;
        }
        return vitalidade;
    }

    // Verificador de vida
    public boolean estaVivo () {
        if (vitalidade > 0) {
            return true;
        }
        return false;
    }

    // Visualizadores
    public String verNome () {
        return this.nome;
    }

    // Visualizador de vitalidade
    public void verVitalidade() {
        System.out.println("\nA vitalidade de " + this.nome + " é " + this.vitalidade + " pontos.");
    }






}
