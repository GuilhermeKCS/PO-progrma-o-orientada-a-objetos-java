import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
       int conta, opcao, i;
       double depositar, sacar, saldo;
       Scanner entrada = new Scanner(System.in);
       
       ContaCorrente[] matBanco = new ContaCorrente[15] ;
        
        for (i=0; i<3; i++){
            System.out.println("Digite o numero da conta: ");
            conta = entrada.nextInt();
            System.out.println("Digite o saldo da conta: ");
            saldo = entrada.nextDouble();
            
            matBanco[i] = new ContaCorrente(conta, saldo);    
        }
    
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
       
       do{
          
           System.out.println("\n1 - Depositar");
           System.out.println("2 - Sacar");
           System.out.println("3 - Consultar Saldo");
           System.out.println("4 - Listar contas");
           System.out.println("5 - Sair\n");
           
           System.out.println("\nDigite a opcao: ");
           opcao = entrada.nextInt();
           ContaCorrente cc;
           switch (opcao){
                case 1: 
                    cc = procuraConta(entrada, matBanco);
                    if(cc == null) {
                        System.out.println("Conta não cadastrada");
                    }
                    else{
                        System.out.println("\nInsira o valor para depositar: \n");
                        cc.depositar(entrada.nextDouble());
                    }
                    break;
                case 2: 
                    cc = procuraConta(entrada, matBanco);
                    if(cc == null) {
                        System.out.println("Conta não cadastrada");
                    }
                    else{
                        System.out.println("\nInsira o valor para sacar: \n");
                        sacar = entrada.nextDouble();
                        if (sacar <= cc.getSaldo()){
                            cc.sacar(sacar);
                        }
                        else{
                        System.out.println("\nSaldo insuficiente\n");
                        }
                    }
                    break;
                case 3: 
                    cc = procuraConta(entrada, matBanco);
                    if(cc == null) {
                        System.out.println("Conta não cadastrada");
                    }
                    else{
                        System.out.println("\nSeu saldo é de: " + df.format(cc.getSaldo()));
                    }
                    break;
                case 4: 
                    System.out.println("Numero da conta    Saldo");
                    
                    for (i=0; i<3; i++){
                        System.out.println(matBanco[i].getNumero() +"   "+ matBanco[i].getSaldo());
                    }
                    break;
           }
              
           
       }while(opcao <5);
        
        
        
        
    }
    
    public static ContaCorrente procuraConta(Scanner entrada, ContaCorrente[] matBanco){
        System.out.print("\nDigite o numero da conta ");
        int conta = entrada.nextInt();
        
        for ( int i=0; i<3; i++){
            if (conta == matBanco[i].getNumero()){
                return matBanco[i];
            }
        }
        return null;
    }
}
