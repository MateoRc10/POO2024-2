class Ejer34 {
    public static void main(String[] args) {
        var altura=0f;
        Console.writeLine("Ingrese la altura del vehiculo en metros");
        altura = Float.parseFloat(Console.readLine());
        if (altura<5) {
            Console.writeLine("El vehiculo puede pasar");
            }else{
                Console.writeLine("El vehiculo no puede pasar");
            
        }

    }
    
}
