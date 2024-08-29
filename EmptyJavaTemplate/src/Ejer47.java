class Ejer47 extends Terminal {
    public static void main(String[] args) {
        var num1 = 0;
        var num2 = 0;
        var num3 = 0;
        printLine("Ingrese 3 numeros enteros");
        num1 = Integer.parseInt(scanLine());
        num2 = Integer.parseInt(scanLine());
        num3 = Integer.parseInt(scanLine());
        if (num1 > num2 && num1 > num3) {
            printLine("El numero mayor es" + num1);

        } else {
            if (num1 < num2 && num2 > num3) {
                printLine("El numero mayor es" + num2);

            } else {
                if (num3 > num2 && num3 > num1) {
                    printLine("El numero mayor es:" + num3);

                }

            }
        }
    }
}
