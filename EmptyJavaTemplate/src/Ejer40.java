class Ejer40 extends Terminal {
    public static void main(String[] args) {
        var lado1=0f;
        var lado2=0f;
        var lado3=0f;
        printLine("Ingrese la longitud del primer lado");
        lado1 = Float.parseFloat(scanLine());
        printLine("Ingrese la longitud del segundo lado");
        lado2 = Float.parseFloat(scanLine());
        printLine("Ingrese la longitud del tercer lado");
        lado3 = Float.parseFloat(scanLine());
       

            if (lado1 == lado2 && lado2 == lado3) {
                printLine("El triangulo es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                printLine("El triángulo es isósceles.");
            } else {
                printLine("El triángulo es escaleno.");
            }
        }

   
    
    
    

        
    }
    

