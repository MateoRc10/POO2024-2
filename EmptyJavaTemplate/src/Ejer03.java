 class Ejer03 {
    public static void main(String[] args) {
        var rad = 0f;
        var h = 0f;
        var v = 0.f;
        Console.writeLine("Ingrese el radio de la base");
        rad = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la altura del cilindro");
        h = Float.parseFloat(Console.readLine());
        v = (float)( Math.PI * Math.pow(rad, 2) * h);
        Console.writeLine("El volumen del cilindro es : %f" , v);

        
        
    }
    
}
