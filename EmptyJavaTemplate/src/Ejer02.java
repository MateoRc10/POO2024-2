class Ejer02 {
    public static void main(String[] args) {
     var vo = 0f;
     var ac = 0f;
     var tt = 0f;
     var dr = 0.0;
        Console.writeLine("Ingrese la velicidad inicial");
        vo = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la aceleracion");
        ac = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el tiempo transcurrido");
        tt = Float.parseFloat(Console.readLine());
        dr = vo * tt + (1/2) * Math.pow(ac * tt, 2);
        Console.writeLine("La distancia recorrida es: %f",dr);




        
        
    }
    
}
