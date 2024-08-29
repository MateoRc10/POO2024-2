class Ejer52 extends Terminal {
    public static void main(String[] args) {
        var dado = 0;
        var posUsuario = 0;
        var posUsuario2 = 0;
        var dado2 = 0;

        printLine("La posicion inicial es 0");

        while (posUsuario < 100 && posUsuario2 < 100) {
            dado = (int) (1 + Math.random() * 6);
            dado2 = (int) (1 + Math.random() * 6);
            printLine("Presione Enter para tirar");
            scanLine();

            if (posUsuario == 10) {
                posUsuario = 33;
                if (posUsuario == 16)
                    posUsuario = 37;
                if (posUsuario == 41)
                    posUsuario = 41;
                if (posUsuario == 35)
                    posUsuario = 54;
                if (posUsuario == 44)
                    posUsuario = 76;
                if (posUsuario == 80)
                    posUsuario = 99;
                if (posUsuario == 23)
                    posUsuario = 2;
                if (posUsuario == 34)
                    posUsuario = 15;
                if (posUsuario == 52)
                    posUsuario = 31;
                if (posUsuario == 62)
                    posUsuario = 43;
                if (posUsuario == 89)
                    posUsuario = 68;
                if (posUsuario == 95)
                    posUsuario = 74;

            }
            if (posUsuario + dado <= 100) {
                posUsuario += dado;
            } else
                printLine("Perdio el Turno");

            printLine("Sacaste: %d", dado);
            printLine("Tu casilla actual es: %d", posUsuario);
            if (posUsuario2 == 10) {
                posUsuario2 = 33;
                if (posUsuario2 == 16)
                    posUsuario2 = 37;
                if (posUsuario2 == 41)
                    posUsuario2 = 41;
                if (posUsuario2 == 35)
                    posUsuario2 = 54;
                if (posUsuario2 == 44)
                    posUsuario2 = 76;
                if (posUsuario2 == 80)
                    posUsuario2 = 99;
                if (posUsuario2 == 23)
                    posUsuario2 = 2;
                if (posUsuario2 == 34)
                    posUsuario2 = 15;
                if (posUsuario2 == 52)
                    posUsuario2 = 31;
                if (posUsuario2 == 62)
                    posUsuario2 = 43;
                if (posUsuario2 == 89)
                    posUsuario2 = 68;
                if (posUsuario2 == 95)
                    posUsuario2 = 74;
            }
            if (posUsuario2 + dado2 <= 100) {
                posUsuario2 += dado2;
            } else
                printLine("Perdio el turno la computadora");
            printLine("La computadora saco: %d", dado2);
            printLine("La casilla de la computadora es: %d", posUsuario2);

        }
        if (posUsuario >= 100) {
            printLine("Ganaste");

        } else if (posUsuario2 >= 100) {
            printLine("Gano la computadora");

        } else if (posUsuario == 100 && posUsuario2 == 100) {
            printLine("Hubo un empate");

        }

    }
}
