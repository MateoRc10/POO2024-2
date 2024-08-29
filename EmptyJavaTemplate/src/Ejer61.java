class Ejer61 extends Terminal {
    public static void main(String[] args) {
        var dado1 = (int) (1 + Math.random() * 6);
        var dado2 = (int) (1 + Math.random() * 6);
        var dado3 = (int) (1 + Math.random() * 6);
        var dado4 = (int) (1 + Math.random() * 6);
        var PuntosPc = 0;
        var PuntosHumano = 0;
        var PuntosTurno = 0;
        var PuntosTurno2 = 0;

        var NumeroAleatorio = 0;
        var resp = '?';
        var respPc = '?';

        printLine("Bienvenido al juego PIG, Presiona Enter para comenzar");
        scanLine();

        NumeroAleatorio = (int) (0 + Math.random() * 3);

        respPc = 'S';
        while (resp == 'S' || resp == 'N' || respPc == 'S' || respPc == 'N') {

            while (respPc == 'S' || resp == 'N') {
                NumeroAleatorio = (int) (0 + Math.random() * 3);

                if (NumeroAleatorio == 2 || NumeroAleatorio == 3) {
                    respPc = 'S';

                } else if (NumeroAleatorio == 0 || NumeroAleatorio == 1) {
                    respPc = 'N';
                }
                dado1 = (int) (1 + Math.random() * 6);
                dado2 = (int) (1 + Math.random() * 6);
                PuntosTurno = dado1 + dado2;
                printLine("Lanzando Dados. . .");
                printLine("El valor de los dados es %d y %d", dado1, dado2);

                if (dado1 == 1 || dado2 == 1) {
                    PuntosTurno = 0;
                    printLine("La computadora tiene: %d puntos", PuntosPc);
                    respPc = 'N';
                    break;
                } else if (dado1 == 1 && dado2 == 1) {
                    PuntosTurno = 0;
                    PuntosPc = PuntosTurno;
                    printLine("La computadora tiene: %d puntos", PuntosPc);
                    break;

                }

                if (dado1 != 1 && dado2 != 1) {
                    PuntosPc += PuntosTurno;
                }

                printLine("La computadora tiene: %d puntos", PuntosPc);

            }
            if (dado1 == 1 && dado2 == 1) {
                PuntosTurno = 0;
                PuntosPc = 0;
                printLine("LA COMPUTADORA SACO 2 UNOS, AHORA TIENE: %d puntos", PuntosPc);
            }

            if (PuntosHumano >= 100) {

                printLine("GANASTE, CONSEGUISTE: %d PUNTOS", PuntosHumano);
                break;

            } else if (PuntosPc >= 100) {
                printLine("GANO LA COMPUTADORA, CONSIGUIO %d PUNTOS", PuntosPc);
                break;

            }

            while (resp == 'S' || respPc == 'N') {

                printLine("Presione ENTER para lanzar");
                scanLine();

                dado3 = (int) (1 + Math.random() * 6);
                dado4 = (int) (1 + Math.random() * 6);
                PuntosTurno2 = dado4 + dado3;
                printLine("Lanzando dados...");
                printLine("Valor dados: %d y %d", dado3, dado4);
                if (dado3 == 1 || dado4 == 1) {
                    PuntosTurno2 = 0;
                    resp = 'N';
                    printLine("Tienes: %d", PuntosHumano, "Puntos");
                    break;

                } else if (dado3 == 1 && dado4 == 1) {
                    PuntosHumano = 0;
                    resp = 'N';
                    printLine("Tienes: %d", PuntosHumano, "Puntos");
                    break;

                }

                if (dado3 != 1 && dado4 != 1) {
                    PuntosHumano += PuntosTurno2;
                }

                printLine("Tienes: %d", PuntosHumano, "Puntos");
                printLine("Deseas Lanzar De Nuevo? (S/N)");
                resp = scanLine().toUpperCase().trim().charAt(0);
                if (resp == 'N') {
                    break;
                }
            }
            if (dado3 == 1 && dado4 == 1) {
                PuntosTurno2 = 0;
                PuntosHumano = 0;
                printLine("SACASTE 2 UNOS AHORA TIENES: %d puntos", PuntosHumano);
            }

            if (PuntosHumano >= 100) {
                printLine("GANASTE, CONSEGUISTE %d PUNTOS", PuntosHumano);
                break;

            } else if (PuntosPc >= 100) {
                printLine("GANO LA COMPUTADORA, CONSIGIO %d PUNTOS", PuntosPc);
                break;
            }

        }

    }
}
