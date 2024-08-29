class Ejer46 extends Terminal{
    public static void main(String[] args) {
        var precio =0f;
        var cantidad =0;
        var totalproducto = 0f;
        var descuento = 0f;
        printLine("Ingrese el precio del articulo");
        precio = Float.parseFloat(scanLine());
        printLine("Ingrese la cantidad del producto");
        cantidad = Integer.parseInt(scanLine());
        totalproducto = (precio*cantidad);
        if (cantidad<=10) { printLine("No tiene descuento y el precio es: %f", totalproducto); 
            
        }else{ if (cantidad>10 && cantidad<=20) { descuento = (float) ((float) totalproducto-(totalproducto*0.10)); 
            printLine("El precio total es: %f",descuento);
            
        }else{ if (cantidad>20) { descuento = (float) ((float) totalproducto-(totalproducto*0.20)); 
            printLine("El precio total es: %1f",descuento);
            
        }

        
    }
    
}
}
}
