 class Ejer36 {
    public static void main(String[] args) {
        var puntoseq1=0;
        var puntoseq2=0;
        Console.writeLine("Escriba los puntos del primer equipo");
        puntoseq1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Escriba los puntos del segundo equipo");
        puntoseq2 = Integer.parseInt(Console.readLine());
        if (puntoseq1==puntoseq2) {
            Console.writeLine("El partido se va a tiempo extra");
            }else{ if (puntoseq2<puntoseq1) { Console.writeLine("El equipo 1 es el ganador");
            }else{ if (puntoseq1<puntoseq2) { Console.writeLine("El equipo 2 es el ganador");

                
            }
                
            }
            
            
        }
        
    }
    
}
