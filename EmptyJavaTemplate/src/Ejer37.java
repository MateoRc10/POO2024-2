 class Ejer37 {
    public static void main(String[] args) {
        var temperatura=0f;
        var temperaturamaxima=90;
        Console.writeLine("Escriba la temperatura del sistema");
        temperatura = Float.parseFloat(Console.readLine());
        if (temperatura<temperaturamaxima) { Console.writeLine("La temperatura es apropiada");
        }else{ Console.writeLine("Se ha excedido la temperatura");
            
        }
        
    }
    
}
