import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int codProd, qtdeVend;
        String descProd;
        double precUnit, valCompra, desconto ;

        System.out.print("Digite o código do produto: ");
        codProd = entrada.nextInt();//scanf("%d", &codProd);

        System.out.print("Digite a descrição: ");
        descProd = entrada.next(); //scanf("%s", &descProd);

        System.out.print("Digite o preço unitário: ");
        precUnit = entrada.nextDouble();//scanf("%lf", &precUnit);

        System.out.print("Digite a quantidade vendida: ");
        qtdeVend = entrada.nextInt();//scanf("%d", &qtdeVend);

        valCompra = precUnit * qtdeVend;
        if (valCompra >= 850){
                desconto = 0.10 * valCompra;
    }else{
        desconto = 0 ;
}
        valCompra -= desconto;
        System.out.println("\nValor desconto: " + desconto);
        System.out.println("\nValor da compra: " + valCompra);
    }
}

