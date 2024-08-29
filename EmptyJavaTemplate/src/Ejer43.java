 class Ejer43 extends Terminal {
    public static void main(String[] args) {
        var año=0;
        var mes=0;
        printLine("Ingrese el mes en formato numerico");
        mes = Integer.parseInt(scanLine());
        printLine("Ingrese el año");
        año = Integer.parseInt(scanLine());
        int dias = 0;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                printLine("Mes no válido.");
                break;
        }

        if (dias != 0) {
            printLine("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
        }
    }
}

        
    
    

