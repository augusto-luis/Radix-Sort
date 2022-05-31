package questão01;

public class Node<Elementos> {
    
    private Elementos elemento;
    private Node<Elementos> proximoElemento;

    public Node(Elementos elemento, Node<Elementos> proximo){
        this.elemento = elemento;
        this.proximoElemento = proximo;
    }

    public Elementos getElemento(){
        return this.elemento;
    }

    public void setElemento(Elementos elemento){
        this.elemento = elemento;
    }

    public Node getProximo(){
        return this.proximoElemento;
    }

    public void setProximo(Node<Elementos> proximo){
        this.proximoElemento = proximo;
    }
}

