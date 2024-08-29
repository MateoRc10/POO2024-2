class Ejer33 {
    public static void main(String[] args) {
        var altura = 0f;
        Console.writeLine("Ingrese su estatura en centimetros");
        altura = Float.parseFloat(Console.readLine());
        if (altura > 120) {
            Console.writeLine("Puede ingresar a la atraccion");
        } else {
            Console.writeLine("No puede ingresar a la atraccion");

        }

    }

}
