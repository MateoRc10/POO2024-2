class Ejer41 extends Terminal {
    public static void main(String[] args) {
        var precio=0f;
        var A=1;
        var B=2;
        var C=3;
        var tipoproducto=0;
        var totalproducto=0f;
      
        printLine("Ingrese el precio del producto");
        precio = Float.parseFloat(scanLine());
        printLine("Ingrese el tipo de producto:(1) si es A, 2 si es B o 3 si es  C");
        tipoproducto = Integer.parseInt(scanLine());
        if (tipoproducto==A) { totalproducto=(float) (precio-(precio*0.10)); printLine("El precio es: %f", totalproducto);
            
            
        }else{ if (tipoproducto==B) { totalproducto=(float) (precio-(precio*0.20)); printLine("El precio es: %f", totalproducto);
            
        }else{ if (tipoproducto==C) {totalproducto=(float) (precio-(precio*0.30)); printLine("El precio es: %f", totalproducto);


        
    }
    
}
}
}
}
