class Ejer04 {
    public static void main(String[] args) {
        var n1 = 0f;
        var n2 = 0f;
        var n3 = 0f;
        var n4 = 0f;
        var p1 = 0f;
        var p2 = 0f;
        var p3 = 0f;
        var p4 = 0f;
        var pp = 0f;
        Console.writeLine("Ingrese 3 notas");
        n1 = Float.parseFloat(Console.readLine());
        n2 = Float.parseFloat(Console.readLine());
        n3 = Float.parseFloat(Console.readLine());
        n4 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese sus porcentajes de peso");
        p1 = Float.parseFloat(Console.readLine());
        p2 = Float.parseFloat(Console.readLine());
        p3 = Float.parseFloat(Console.readLine());
        p3 = Float.parseFloat(Console.readLine());
        pp = (n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4)/(p1 + p2 + p3 + p4);
        Console.writeLine("El promedio ponderado es: %.1f", pp);

        
    }
    
}
