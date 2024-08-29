 class Ejer35 {
    public static void main(String[] args) {
        var emisiones=0f;
        Console.writeLine("Ingrese el valor de emisiones del vehiculo en gCO2/Km");
        emisiones = Float.parseFloat(Console.readLine());
        if (emisiones>=9) {
            Console.writeLine("El vehiculo no puede circular");
            }else{
                Console.writeLine("El vehiculo puede circular");
            
        }
        
    }
    

    
}
