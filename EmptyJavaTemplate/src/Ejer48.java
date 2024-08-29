class Ejer48 extends Terminal {
    public static void main(String[] args) {
    var numeroSecreto = (int)(1 + Math.random() * (10 - 1 + 1));
    printLine("El numero secreto es: %d", numeroSecreto);
    
    var intento=0;
    printLine("¡Bienvenido al juego de adivinanza de números! Intenta adivinar un número entre 1 y 100.");
         printLine("Ingresa tu número tienes 4 intentos:");

         intento = Integer.parseInt(scanLine());
        
         if (intento==numeroSecreto) { 
            printLine("Adivinaste");
         }
         else{printLine("Fallaste Te quedan 3 intentos");
            intento= Integer.parseInt(scanLine()); 
            if (intento == numeroSecreto) {
                printLine("Adivinaste");
         }
         if (intento!=numeroSecreto) { 
            printLine("Fallaste Te quedan 2 intentos");
            intento= Integer.parseInt(scanLine());
            if (intento == numeroSecreto) {
                printLine("Adivinaste");
            }
            }
        if (intento!=numeroSecreto) {
             printLine("Fallaste Te queda 1 intento");
             intento= Integer.parseInt(scanLine());
         if (intento == numeroSecreto) {
            printLine("Adivinaste");
        } if (intento!=numeroSecreto) {
            printLine("No tienes mas intentos");
        }
            
    }
}
}
}
         
         
            
            
            
            
            
            
            
            
            
                
            
            
         
         
         
         

    
                
                
                
          
    


    
    

