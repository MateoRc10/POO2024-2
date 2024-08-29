class Ejer01 {
    public static void main(String[] args) {
        var saldoInicial = 0;
        var InteresAnual = 0f;
        var NumeroAños = 0;
        var MontoFinal = 0.0;

        
        Console.writeLine("Ingrese el saldo inicial");
        saldoInicial = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el interes anual");
        InteresAnual = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el numero de años");
        NumeroAños = Integer.parseInt(Console.readLine());
        MontoFinal = saldoInicial *  Math.pow(1 + InteresAnual / 100, NumeroAños);
        Console.writeLine("El monto final es: %f", MontoFinal);
        

        
        



    }
    
}
