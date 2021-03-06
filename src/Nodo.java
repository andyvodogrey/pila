public class Nodo {
    private int info;
    private Nodo next = new Nodo();

    public Nodo(){
        this.next = null;
    }

    public Nodo(int info, Nodo next){
        this.info = info;
        this.next = next;
    }

    public Nodo(int info){
        this.info = info;
        next = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}
