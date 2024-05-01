import java.util.Scanner;

public class miniProjeto {
    public static void main(String[] args) {

        Scanner escaneador = new Scanner(System.in);

        Textos textos = new Textos();
        Personagem persona1 = new Personagem("Eva");
        Personagem persona2 = new Personagem("Max");

        // Capítulo A
        Capitulo capituloA = new Capitulo("capituloA", textos.verCapituloA(), "Investigar",
                "Evitar", persona1, persona2, 10, escaneador);

        capituloA.mostrar();
        int escolhaA = capituloA.escolher();
        persona1.verVitalidade();
        persona2.verVitalidade();

        if (escolhaA == 1) {
            // Capítulo B
            Capitulo capituloB = new Capitulo("capituloB", textos.verCapituloB(), "Lutar",
                    "Fugir", persona1, persona2, 10, escaneador);

            capituloB.mostrar();
            int escolhaB = capituloB.escolher();
            persona1.verVitalidade();
            persona2.verVitalidade();

            if (escolhaB == 1) {
                // Final A
                Capitulo finalA = new Capitulo("finalA", textos.verFinalA(), null,
                        null, persona1, persona2, 100, escaneador);

                finalA.mostrar();
            } else {
                // Final B
                Capitulo finalB = new Capitulo("finalB", textos.verFinalB(), null,
                        null, persona1, persona2, 100, escaneador);

                finalB.mostrar();
            }
        } else {
            // Capítulo C
            Capitulo capituloC = new Capitulo("Prólogo", textos.verCapituloC(), "Forçar a entrada",
                    "Procurar outra rota", persona1, persona2, 10, escaneador);

            capituloC.mostrar();
            int escolhaC = capituloC.escolher();
            persona1.verVitalidade();
            persona2.verVitalidade();

            if (escolhaC == 1) {
                // Final C
                Capitulo finalC = new Capitulo("finalC", textos.verFinalC(), null,
                        null, persona1, persona2, 0, escaneador);

                finalC.mostrar();
            } else {
                // Final D
                Capitulo finalD = new Capitulo("finalD", textos.verFinalD(), null,
                        null, persona1, persona2, 0, escaneador);

                finalD.mostrar();
            }
        }
        escaneador.close();
    }
}
