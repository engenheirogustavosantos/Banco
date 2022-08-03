public class Banco {
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;
   
        public void info(){
          if(this.getStatus() == true){
        System.out.println("Usuário: " +this.getDono());
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Status da conta:" + this.getStatus());
            }
            else{
                System.out.println("ERRO! Conta fechada.");
            }
   }
        
   public int getNumConta(){
        return numConta;
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    } 
   
   
    public void abrirConta(String t){
     this.setTipo(t);
     this.setStatus(true);
     if(t == "CP"){
         this.setSaldo(150);
     }
     else{
         if(t == "CC"){
             this.setSaldo(50);
         }
     }
    }
    
    public void fecharConta(){
       if(this.getSaldo() > 0){
           System.out.println("Conta com dinheiro!");
       }
       else{
           if(this.getSaldo() < 0){
               System.out.println("Conta em débito!");
           }
           else{
              this.setStatus(false);
              System.out.println("Conta fechada com sucesso!");
           }
       }
       
    }
    
    public void depositar(float v){
        if(this.getStatus()){
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Saldo depositado com sucesso na conta de " +this.getDono());
        }
        else{
            System.out.println("Impossível depositar!");
        }
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso!");
        }
            else{
                System.out.println("Saldo Insuficiente!");
            }
    }
    }
    
    public void pagarMensal(){
             int v = 0;
             if(this.getTipo() == "CC"){
                 v = 12;
             }
             else{
                 if(this.getTipo() == "CP"){
                     v = 20;
                 }
             }
             if(this.getStatus()){
                 this.setSaldo(this.getSaldo() - v);
                 System.out.println("Mensalidade paga com sucesso!");
             }
             else{
                 System.out.println("Impossível pagar com uma conta fechada!");
             }
    }
    
    public Banco(){
        this.saldo = 0;
        this.status = false;    
    }
    

    
}
