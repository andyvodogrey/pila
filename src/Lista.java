public class Lista {

        private Nodo head;

        public Lista(){
            head = null;
        }

        public Lista(Nodo head){
            this.head = head;
            //this.coda = coda;
        }

        /**** Ritorna lista dispari ****/
        public Lista dispari(Lista originale){
            Lista c = new Lista();
            Nodo q = head;
            int cont = 1;

            while(q != null) {

                if(cont % 2 != 0){
                    c.aggiungiCoda(q.getInfo());
                }
                cont++;
                q = q.getNext();
            }
            return c;
        }


        /**** Aggiungi Nodi in testa ****/
        public void aggiungiTesta(int a) {

            Nodo p = new Nodo(a, null);

            p.setNext(head);
            head =p;
        }

        /**** Aggiungi Nodi in Coda ****/
        public void aggiungiCoda(int a){

            Nodo p = new Nodo(a,null);
            Nodo q;

            if (head == null) {
                p.setNext(head);
                head = p;
            }else{
                if(head.getNext() == null){
                    head.setNext(p);
                }else{
                    q = head.getNext();
                    while (q.getNext() != null){
                        q = q.getNext();
                    }
                    q.setNext(p);
                }
            }
        }

        /**** Stampa Lista ****/
        public void stampaLista() {
            Nodo q;
            q = head;

            while (q != null){
                System.out.println(q.getInfo());
                q = q.getNext();
            }
        }


}
