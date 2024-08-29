 class Ejer39 {
    public static void main(String[] args) {
        var puntaje=0f;
        var puntajemaximo=5;
        var puntajeaprobacion=0f;
        Console.writeLine("Escriba la nota obtenida");
        puntaje = Float.parseFloat(Console.readLine());
        puntajeaprobacion = (float) (0.60*puntajemaximo);
        if (puntaje>=puntajeaprobacion) { Console.writeLine("Usted aprobo el examen");
        }else{ Console.writeLine("Usted reprobo el examen");
            
        }

        
    }
    
}
