package calculadora_de_monedas;
import java.util.Scanner;

public class Calculadora_de_monedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa la cantidad en pesos: ");
        double pesos = scanner.nextDouble();
        
        double tasaEuro = 18.21;  
        double tasaDolar = 17.07;  
        double tasaYen = 0.12;    
        double tasaLibra = 2118; 
        
        double euros = pesos / tasaEuro;
        double dolares = pesos / tasaDolar;
        double yen = pesos / tasaYen;
        double libras = pesos / tasaLibra;
        
        System.out.println(pesos + " pesos son equivalentes a:");
        System.out.println(euros + " euros");
        System.out.println(dolares + " dólares");
        System.out.println(yen + " yen");
        System.out.println(libras + " libras");
        
        scanner.close();
    }
}
