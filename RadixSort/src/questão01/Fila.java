package questão01;

public class Fila<Elementos>{
    
    private Node<Elementos> fila;

    public Fila(){
        
        this.fila = null;
    }

    public void formatar(){
        
        this.fila = null;
    }

    public int getTamanho(){
        
        int tamanho = 0;
        Node<Elementos> node = this.fila;

        while (node != null){
            
            node = node.getProximo();
            tamanho++;
        }
        return tamanho;
    }

    public boolean isVazia(){
        return this.fila == null;
    }

    public void adiciona(Elementos elemento){
        
        Node<Elementos> node = new Node<>(elemento, null);

        if (this.fila == null){
            this.fila = node;
        }
        else{
            Node<Elementos> temp = this.fila;

            while (temp.getProximo() != null){ 
                
                temp = temp.getProximo();
            }
            temp.setProximo(node);
        }
    }
    
     public Elementos remove(){
        if (this.isVazia()) throw new FilaVaziaException();

        Elementos elemento = this.fila.getElemento();

        this.fila = this.fila.getProximo();

        return elemento;
    }

    public Elementos getElemento(){
        
        if (this.isVazia()) throw new FilaVaziaException();

        return this.fila.getElemento();
    }

    public void setElemento(Elementos elemento){
        
        if (this.isVazia()) throw new FilaVaziaException();

        this.fila.setElemento(elemento);
    }
}