class Ejer45 extends Terminal {
    public static void main(String[] args) {
        var salario=0f;
        var salariodp=0f;
        printLine("Ingrese su salario anual");
        salario = Float.parseFloat(scanLine());
        if (salario<=10.000) { printLine("No se le aplican impuestos");
            
        }else{ if (salario>10.000 && salario<50.000) { salariodp=(float) (salario-(salario*0.10));
             printLine("Su salario luego de impuestos es: %f", salariodp);
            
        }else{ if (salario>50.000) { salariodp=(float) (salario-(salario*0.20)); 
            printLine("Su salario luego de impuestos es: %f", salariodp);

            
        }
        
    }
    
}
}
}
