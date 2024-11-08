import java.util.ArrayList;

public class voos{
    private int id;
    private int ativo;
    private String destino ;
    private String origem;
    private String status;
    private int time_saida;
    private int time_chegada;
    private ArrayList tripulacao;
    private ArrayList passageiros; 
    private float preco_passagem;

    
    //métodos construtores
    //public voo{
 
        
    //}
    
    //metodos setters
    public void setId(int id, boolean permissao){
        if(permissao= true){
            this.id = id;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
        
    }
    
    public void setPassageiros(long CPF){
        passageiros.add(CPF);
    }
    
    public void setAtivo(int ativo, boolean permissao){
        if(permissao = true){
            this.ativo= ativo;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }
    
    public void setDestino(String destino, boolean permissao){
        if(permissao= true){
            this.destino = destino;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }
    
    public void setOrigem(String origem, boolean permissao){
        if(permissao= true){
            this.origem = origem;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }
    
    public void setTime_saida(int time_saida, boolean permissao){
        if(permissao= true){
            this.time_saida = time_saida;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }
    
    public void setTime_chegada(int time_chegada, boolean permissao){
        if(permissao= true){
            this.time_chegada = time_chegada;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }
    
    public void setPreco_passagem(float preco_passagem, boolean permissao){
        if(permissao= true){
            this.preco_passagem = preco_passagem;
        }else{
            System.out.println("Usuário sem permissão para realizar operação");
        }
    }
    
    //métodos getters
    public int getId(){
        return id;
    }
    
    public String getDestino(){
        return destino;
    }
    
    public String getOrigem(){
        return origem;
    }
    
    public int getTime_saida(){
        return time_saida;
    }
    
    public int getTime_chegada(){
        return time_chegada;
    }
    
    public float getPreco_passagem(){
        return preco_passagem;
    }
    
    public int getAtivo(){
        return ativo;
    }
    

    
    //metodos abstratos
    
    
}
