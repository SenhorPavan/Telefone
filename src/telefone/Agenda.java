
package telefone;


public class Agenda {
    
    private Contato contato[] = new Contato[10];
    private int vc = 0;
    
    
    public void mostrarContato(){
       System.out.println("Contatos");
       
        for(int i = 0; i < vc; i++){
            System.out.println("");
            System.out.println("Nome: "+contato[i].getNome());
            System.out.println("Celular: "+contato[i].getCelular());
            System.out.println("Email: "+contato[i].getEmail());
            System.out.println("Telefone: "+contato[i].getTelefone());
            System.out.println("");

        }
       
    }
    
    public void adicionaContato(Contato contatos){
        this.contato[this.vc] = contatos;
        this.vc++;
    }
     
}
