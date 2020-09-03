public class Guia { 
	node head; 
	public class node { 
        int value1;
		int value2; 
		node next; 
        public node(int val1, int val2) { 
			this.value1 = val1; 
            this.value2 = val2;
		} 
	} 
    node insertarOrdenado(int val1, int val2, node head){
        node nodo = new node(val1, val2);
        if(head == null) { // lista vacía
            head = nodo;
            return head;
        }
        node prev = null, temp = head;
        while(temp != null) {
            if(temp.value1 > nodo.value1) { // temp.val1 > nodo.val1
                if(prev == null) { // menor de la lista
                    nodo.next = temp;
                    head = nodo;
                    return head;
                } else  { // insertar entre medio
                    nodo.next = temp;
                    prev.next = nodo;
                    return head;
                }
            }
            prev = temp;
            temp = temp.next;
        }
        prev.next = nodo;
        nodo.next = null;
        return head;
    }
    void imprimirLista(node head) {
        if(head == null) return;
        imprimirLista(head.next);
        System.out.print(head.value1 + " ");
    }
    node eliminarTarget(int val1, node head) {
        node prev = null, temp = head;
        if(head == null) return;
        if(head.next == null && head.value1 == val1){ // eliminar head
            head = null;
            return;
        } 
        while(temp != null){ // eliminar algo que no sea la cabeza
            if(temp.value1 == val1)
                prev.next = temp.next;
            prev = temp;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Guia list = new Guia(); 
        list.head = list.insertarOrdenado(4, 2, list.head);
        list.head = list.insertarOrdenado(3, 2, list.head);
        list.head = list.insertarOrdenado(2, 2, list.head);
        list.head = list.insertarOrdenado(7, 2, list.head);
        list.head = list.insertarOrdenado(1, 2, list.head);
        list.imprimirLista(list.head);
    }
}