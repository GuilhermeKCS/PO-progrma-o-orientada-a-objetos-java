
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;


public class Aplic {
    public static void main(String[] args) { 
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Cliente objCliente = new Cliente("458.658.123.89", "Russin Molejo", "99875631");
        Instrutor objInstrutor = new Instrutor( 12356 , "Jorge mayweather", "996045789" );
        
        
        objInstrutor.setAreaAtuacao("porteiro");
        System.out.println();
        
        
        
        objCliente.setAltura(1.78);
        objCliente.setPeso(65);
        System.out.println("IMC"+ df.format(objCliente.calcIMC()));
    }
    
}

