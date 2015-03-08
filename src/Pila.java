public class Pila {

    private Nodo head  = new Nodo();

    public Pila(){
        head = null;
    }

    public Pila(Nodo head) {
        this.head = head;
    }

    public void push(int x){

        Nodo p = head;
        head = new Nodo(x, p);

    }
    public int pop() {

        Nodo p = head;

        if (head != null) {
            head = head.getNext();
            p.setNext(null);
        }

        return p.getInfo();
    }

    public void stampaPila(){

    }

}
