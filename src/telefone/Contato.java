
package telefone;


public class Contato {
    
    private String telefone;
    private String celular;
    private String nome;
    private String email;
    
    public Contato(String nome, String celular, String telefone, String email){  
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.telefone = telefone;
       
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    
    
}
