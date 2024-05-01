import java.util.Scanner;
public class miniProjeto {
    public static void main(String[] args) {
    
    Scanner escaneador = new Scanner(System.in);

    Textos textos = new Textos();
    Personagem persona1 = new Personagem("Eva");
    Personagem persona2 = new Personagem("Max");
    
    // Prólogo
    textos.verPrologo();

    //Capítulos
    Capitulo capituloA = new Capitulo("capituloA", textos.verCapituloA(), "Investigar", 
    "Evitar", persona1, persona2, 10, escaneador);

    capituloA.mostrar();
    capituloA.escolher();
    persona1.verVitalidade();
    persona2.verVitalidade();

    if(capituloA.escolher() == 1){
        Capitulo capituloB = new Capitulo("capituloB", textos.verCapituloB(), "Lutar", 
        "Fugir", persona1, persona2, 10, escaneador);

    capituloB.mostrar();
    capituloB.escolher();
    persona1.verVitalidade();
    persona2.verVitalidade();

        if (capituloB.escolher() == 1) {
            Capitulo finalA = new Capitulo("finalA", textos.verFinalA(), null, 
            null, persona1, persona2, 100, escaneador);

            finalA.mostrar();
        } 

        else {
            Capitulo finalB = new Capitulo("finalB", textos.verFinalB(), null, 
            null, persona1, persona2, 100, escaneador);

            finalB.mostrar();
        }
    }
    
    else {
        Capitulo capituloC = new Capitulo("Prólogo", textos.verCapituloC(), "Forçar a entrada", 
        "Procurar outra rota", persona1, persona2, 10, escaneador);

        capituloC.mostrar();
        capituloC.escolher();
        persona1.verVitalidade();
        persona2.verVitalidade();

        if (capituloC.escolher() == 1) {
            Capitulo finalC = new Capitulo("finalC", textos.verFinalC(), null, 
            null, persona1, persona2, 0, escaneador);

            finalC.mostrar();
            
        } 

        else {
            Capitulo finalD = new Capitulo("finalD", textos.verFinalD(), null, 
            null, persona1, persona2, 0, escaneador);

            finalD.mostrar();
            
        }
    }
    escaneador.close();
    }
}
