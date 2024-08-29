class Ejer38 {
    public static void main(String[] args) {
        var horareloj1 = 0f;
        var horareloj2 = 0f;
        Console.writeLine("Ingrese la hoa del primer reloj");
        horareloj1 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la hora del segundo reloj");
        horareloj2 = Float.parseFloat(Console.readLine());
        if (horareloj1 != horareloj2) {
            Console.writeLine("Los relojes estan desincronizados");
        } else {
            Console.writeLine("Los relojes estan sincronizados");

        }

    }

}
