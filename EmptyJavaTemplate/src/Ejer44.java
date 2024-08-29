class Ejer44 extends Terminal {
    public static void main(String[] args) {
        var edad=0;
        printLine("Ingrese su edad");
        edad = Integer.parseInt(scanLine());
        if (edad<=12) { printLine("Tiene un descuento del 50%");
            
        }else{ if (edad<18) { printLine("Tiene un descuento del 25%");
            
        }else{ printLine("Usted no tiene descuneto");

        }
    }
    
}
}
