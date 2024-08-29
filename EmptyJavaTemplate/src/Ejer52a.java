class Ejer52a extends Terminal {

    static String obtGanador(int numPar, String nomJug1, String nomJug2) {
        var resPar = "";
        var ganPart = "";
        do {
            printLine("PARTIDO #%d", numPar);

            print("Ingrese el resultado del partido entre %s y %s:", nomJug1, nomJug2);
            resPar = scanLine();
            if (resPar.equals("2-0") || resPar.equals("2-1"))
                ganPart = nomJug2;
            else if (resPar.equals("0-2") || resPar.equals("1-2"))
                ganPart = nomJug2;
            else

                printLine("ERROR: El resultado ingresado no es valido, Intente otra vez");

        } while (ganPart.isEmpty());
        printLine("La ganadora del partido #%d es %s", numPar, ganPart);
        return ganPart;

    }

    public static void main(String[] args) {

        var nomJug1 = "";
        var nomJug2 = "";
        var nomJug3 = "";
        var nomJug4 = "";
        var nomJug5 = "";
        var nomJug6 = "";
        var nomJug7 = "";
        var nomJug8 = "";
        var ganPart1 = "";
        var ganPart2 = "";
        var ganPart3 = "";
        var ganPart4 = "";
        var ganPart5 = "";
        var ganPart6 = "";
        var ganPart7 = "";

        printLine("Ingrese el nombre de la jugadora #1: ");

        nomJug1 = scanLine();
        printLine("Ingrese el nombre de la jugadora #2:");

        nomJug2 = scanLine();
        printLine("Ingrese el nombre de la jugadora #3:");

        nomJug3 = scanLine();
        printLine("Ingrese el nombre de la jugadora #4:");

        nomJug4 = scanLine();
        printLine("Ingrese el nombre de la jugadora #5:");

        nomJug5 = scanLine();
        printLine("Ingrese el nombre de la jugadora #6:");

        nomJug6 = scanLine();
        printLine("Ingrese el nombre de la jugadora #7:");

        nomJug7 = scanLine();
        printLine("Ingrese el nombre de la jugadora #8:");

        nomJug8 = scanLine();
        ganPart1 = obtGanador(1, nomJug1, nomJug8);
        ganPart2 = obtGanador(2, nomJug2, nomJug7);
        ganPart3 = obtGanador(3, nomJug3, nomJug6);
        ganPart4 = obtGanador(4, nomJug4, nomJug5);
        ganPart5 = obtGanador(5, ganPart1, ganPart2);
        ganPart6 = obtGanador(6, ganPart3, ganPart4);
        ganPart7 = obtGanador(7, ganPart5, ganPart6);

        printLine("La campeona es %s", ganPart7);
    }

}
