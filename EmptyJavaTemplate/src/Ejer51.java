class Ejer51 extends Terminal {

    public static void main(String[] args) {
        var numrandom = (int) (1 + Math.random() * 100);
        var intento = 0;

        printLine("Bienvenido al juego de adivinanza de numeros, Intenta adivinar el numero entre 1 y 100.");

        while (intento != numrandom) {

            printLine("Ingresa tu numero");
            intento = Integer.parseInt(scanLine());

            if (intento > numrandom) {
                printLine("El numero es mayor al numero secreto intenta otra vez");
            } else if (intento < numrandom) {
                printLine("El numero es menor al numero secreto intenta otra vez");

            }
        }
        if (intento == numrandom) {
            printLine("Adivinaste");
        }

    }

}
