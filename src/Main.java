package linkedLink.src;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.agregarValorAlInicio(33);
        linkedList.agregarValorAlInicio(13);
        linkedList.agregarValorAlInicio(23);
        linkedList.agregarValorAlInicio(16);

        linkedList.agregarPorPosicion(1, 543);
        // imprimir linkedlist
        linkedList.imprimirLinkedList();
        linkedList.remplazarPorPosicion(1, 400);
        linkedList.imprimirLinkedList();

        System.out.println(linkedList.buscarPorPosicion(2).value);
        System.out.println(linkedList.buscarPorPosicion(4).value);

        boolean a = linkedList.buscarPorContenido(222);

        if (a == true) {
            System.out.println("El valor se encuentra en la linkedlist");
        } else {
            System.out.println("El valor no se encuentra en la linkedlist");
        }
        linkedList.eliminarPorPosicion(2);
        linkedList.imprimirLinkedList();
        linkedList.eliminarTail();
        linkedList.imprimirLinkedList();
        linkedList.eliminarHead();
        linkedList.imprimirLinkedList();
    }
}