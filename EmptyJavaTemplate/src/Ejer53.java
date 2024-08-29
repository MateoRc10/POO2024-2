class Ejer53 extends Terminal {
    public static void main(String[] args) {
        var puntosHumano = 0;
        var puntosComputadora = 0;
        var dado1 = 0;
        var dado2 = 0;
        var dado3 = 0;
        var dado4 = 0;
        var TurnoPc = 0;
        var resp = '?';
        var sumadados =0;

        printLine("Bienvenido al juego PIG");
        printLine("Empieza la computadora");
        printLine("Presiona Enter para Comenzar");
        scanLine();

        while (puntosHumano <= 100 && puntosComputadora <= 100) {
            TurnoPc = (int) (1 + Math.random() * 6);
            dado1 = (int) (1 + Math.random() * 6);
            dado2 = (int) (1 + Math.random() * 6);
            sumadados = (dado1 + dado2);

            while (TurnoPc <= 6 && TurnoPc >= 3) {
                if (puntosComputadora + dado1 + dado2 >= 100) {
                    puntosComputadora += dado1 + dado2;
                }
                printLine("La computadora tiene %d", sumadados, "Puntos");
            }

            resp = 'S';
            while (resp == 'S') {
                printLine("Lanzando dados...");
                dado4 = (int) (1 + Math.random() * 6);
                dado3 = (int) (1 + Math.random() * 6);
                printLine("Valor dados: %d y %d", dado3, dado4);

                printLine("¿Desea lanzar los dados de nuevo? (S/N): ");
                resp = scanLine().toUpperCase().trim().charAt(0);
            }

        }

        if (puntosHumano >= 100) {
            printLine("Ganaste");

        } else if (puntosComputadora >= 100) {
            printLine("Gano La computadora");

        }

    }

}
