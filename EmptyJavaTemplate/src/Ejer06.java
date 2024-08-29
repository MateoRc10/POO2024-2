class Ejer06 {
    public static void main(String[] args) {
        var cp = 0f;
        var pv = 0f;
        var Mg = 0f;
        Console.writeLine("Ingrese el costo del producto");
        cp = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el precio de venta del producto");
        pv = Float.parseFloat(Console.readLine());
        Mg = (pv - cp) / cp * 100;
        Console.writeLine("El margen de ganancia es: %.1f%%", Mg );


        
    }
    
}
