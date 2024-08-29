class Ejer49 extends Terminal {
    public static void main(String[] args) {
        var dia = "";
        var placa = "";
        var dig = '?';
        var ciudades = "";

        printLine("Ingrese la placa del vehiculo:");
        placa = scanLine().trim().toUpperCase();

        dig = placa.charAt(5);
        printLine("Ingrese un dia entre LUNES y VIERNES");
        dia = scanLine().trim().toUpperCase();

        if (dia.equals("SABADO") || dia.equals("DOMINGO")) {
            printLine("este dia no se encuentra en la lista");
        }
        if ((dia.equals("LUNES") && (dig == '0' || dig == '1')) ||
                (dia.equals("MARTES") && (dig == '2' || dig == '3')) ||
                (dia.equals("MIERCOLES") && (dig == '4' || dig == '5')) ||
                (dia.equals("JUEVES") && (dig == '6' || dig == '7')) ||
                (dia.equals("VIERNES") && (dig == '8' || dig == '9'))) {

            ciudades = ciudades + "Manizales";
        }
        if ((dia.equals("LUNES") && (dig == '0' || dig == '9')) ||
                (dia.equals("MARTES") && (dig == '1' || dig == '8')) ||
                (dia.equals("MIERCOLES") && (dig == '2' || dig == '7')) ||
                (dia.equals("JUEVES") && (dig == '3' || dig == '6')) ||
                (dia.equals("VIERNES") && (dig == '4' || dig == '5'))){

            ciudades = ciudades + "Pereira";
        }
        if ((dia.equals("LUNES") && (dig == '8' || dig == '9')) ||
                (dia.equals("MARTES") && (dig == '6' || dig == '7')) ||
                (dia.equals("MIERCOLES") && (dig == '4' || dig == '5')) ||
                (dia.equals("JUEVES") && (dig == '2' || dig == '3')) ||
                (dia.equals("VIERNES") && (dig == '0' || dig == '1'))){

            ciudades = ciudades + "Medellin";
        }
        if ((dia.equals("LUNES") && (dig == '1' || dig == '2')) ||
                (dia.equals("MARTES") && (dig == '3' || dig == '4')) ||
                (dia.equals("MIERCOLES") && (dig == '5' || dig == '6')) ||
                (dia.equals("JUEVES") && (dig == '7' || dig == '8')) ||
                (dia.equals("VIERNES") && (dig == '9' || dig == '0'))){

            ciudades = ciudades + "Barranquilla";
        }
        if ((dia.equals("LUNES") && (dig == '8' || dig == '9')) ||
                (dia.equals("MARTES") && (dig == '0' || dig == '1')) ||
                (dia.equals("MIERCOLES") && (dig == '2' || dig == '3')) ||
                (dia.equals("JUEVES") && (dig == '4' || dig == '5')) ||
                (dia.equals("VIERNES") && (dig == '6' || dig == '7'))){

            ciudades = ciudades + "Armenia";
        }
        if ((dia.equals("LUNES") && (dig == '2' || dig == '7')) ||
                (dia.equals("MARTES") && (dig == '3' || dig == '8')) ||
                (dia.equals("MIERCOLES") && (dig == '4' || dig == '9')) ||
                (dia.equals("JUEVES") && (dig == '0' || dig == '5')) ||
                (dia.equals("VIERNES") && (dig == '1' || dig == '6'))){

            ciudades = ciudades + "Bogota";
        }
        if ((dia.equals("LUNES") && (dig == '3' || dig == '4')) ||
                (dia.equals("MARTES") && (dig == '5' || dig == '6')) ||
                (dia.equals("MIERCOLES") && (dig == '7' || dig == '8')) ||
                (dia.equals("JUEVES") && (dig == '9' || dig == '0')) ||
                (dia.equals("VIERNES") && (dig == '1' || dig == '2'))){

            ciudades = ciudades + "Bucaramanga";
        }
        if ((dia.equals("LUNES") && (dig == '1' || dig == '6')) ||
                (dia.equals("MARTES") && (dig == '2' || dig == '7')) ||
                (dia.equals("MIERCOLES") && (dig == '3' || dig == '8')) ||
                (dia.equals("JUEVES") && (dig == '4' || dig == '9')) ||
                (dia.equals("VIERNES") && (dig == '0' || dig == '5'))){

            ciudades = ciudades + "Cartagena";
        }

        printLine("Las ciudades con pico y placa son: %s", ciudades);

    }

}
