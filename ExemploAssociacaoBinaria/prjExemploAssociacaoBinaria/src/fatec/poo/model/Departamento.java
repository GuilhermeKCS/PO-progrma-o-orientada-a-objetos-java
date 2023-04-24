
package fatec.poo.model;

/**
 *
 * @author GuilhermeKCS
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //representando a multiplicidade
                                     //1..*

    private int numFunc; // representa o indice da matriz
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
   //tem como paramêtro de netrada o endereço de um objeto da classe 
    //FuncionarioHorista,funcionariomensalista,funcionariocomissionado
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){
        System.out.println("\nSigla:"+sigla);
        System.out.println("Nome:"+nome);
        System.out.println("Qtde.funcionarios:"+numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int i=0; i < numFunc; i++)
            System.out.println(funcionarios[i].getNome()+
                                funcionarios[i].getRegistro()+
                                 funcionarios[i].getCargo());
    }
    
}
