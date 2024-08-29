class Ejer32 {
    public static void main(String[] args) {
        var peso1 = 0f;
        var peso2 = 0f;
        var peso3 = 0f;
        var peso4 = 0f;
        var peso5 = 0f;
        var pesototal = 0f;
        Console.writeLine("Ingrese el peso de las 5 personas en kilogramos");
        peso1 = Float.parseFloat(Console.readLine());
        peso2 = Float.parseFloat(Console.readLine());
        peso3 = Float.parseFloat(Console.readLine());
        peso4 = Float.parseFloat(Console.readLine());
        peso5 = Float.parseFloat(Console.readLine());
        pesototal = (peso1 + peso2 + peso3 + peso4 + peso5);
        if (pesototal > 600) {
            Console.writeLine("El peso maximo fue exedido");
        } else {
            Console.writeLine("Es seguro ingresar al ascensor");

        }

    }

}
