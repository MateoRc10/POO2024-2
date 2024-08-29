class Ejer42 extends Terminal {
    public static void main(String[] args) {
        var pesokg=0f;
        var A=1;
        var B=2;

        var pesoLb=0f;
        var pesoG=0f;
        var tipounidad=0;
        printLine("Ingrese el peso en Kilogramos");
        pesokg = Float.parseFloat(scanLine());
        printLine("Ingrese (1) si quiere convertir a gramos y (2) si quiere convertir a libras");
       tipounidad = Integer.parseInt(scanLine());
        if (tipounidad==A) { pesoG=(pesokg*1000); printLine("El peso en gramos es: %f", pesoG);
            
        }else{ if (tipounidad==B) { pesoLb=(float) (pesokg*2.20462262); printLine("El peso en libras es: %f", pesoLb);
            
        }


        
    }
    
}
}
