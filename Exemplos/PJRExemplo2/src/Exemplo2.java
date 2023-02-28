import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num, resultado;
        

        System.out.print("Digite um numero inteiro: ");
        num = entrada.nextInt();
        
        for ( int i=1; i <= 10; i++){
            resultado = num * i;
            System.out.println( num + " x" + i + " = " + resultado );
        }
    
    }
}   
