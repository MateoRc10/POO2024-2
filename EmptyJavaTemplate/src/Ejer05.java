 class Ejer05 {
    public static void main(String[] args) {
        var cantidadAdenina = 0; // Cantidad de Adenina
        var cantidadTimina = 0; // Cantidad de Timina
        var cantidadCitosina = 0; // Cantidad de Citosina
        var cantidadGuanina = 0; // Cantidad de Guanina
        var canTotal = 0; // Suma de todas las bases
        var porcenAdenina = 0f; // Porcentaje de adenina
        var porcenTimina = 0f; // Porcentaje de timina
        var porcenCitosina = 0f; // Porcentaje de citosina
        var porcenGuanina = 0f; // Porcentaje de guanina
        
        Console.writeLine("Ingrese la cantidad de adenina");
        cantidadAdenina = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la cantidad de timina");
        cantidadTimina = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la cantidad de citosina");
        cantidadCitosina = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la cantidad de guanina");
        cantidadGuanina = Integer.parseInt(Console.readLine());

        canTotal = cantidadAdenina + cantidadTimina + cantidadCitosina + cantidadGuanina;

        porcenAdenina = cantidadAdenina * 100f / canTotal; // Con la f obligo que el resultado tenga decimales
        porcenTimina = cantidadTimina * 100f / canTotal; 
        porcenCitosina = cantidadCitosina * 100f / canTotal; 
        porcenGuanina = cantidadGuanina * 100f / canTotal; 

        Console.writeLine("El porcentaje de composicion de Adenina es: %.1f%%", porcenAdenina); //Con .1f ponga un solo decimal
        Console.writeLine("El porcentaje de composicion de Timina es: %.1f%%", porcenTimina);
        Console.writeLine("El porcentaje de composicion de Citosina es: %.1f%%", porcenCitosina);
        Console.writeLine("El porcentaje de composicion de Guanina es: %.1f%%", porcenGuanina);
        
        
    }
    
}
