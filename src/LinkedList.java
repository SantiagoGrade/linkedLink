package linkedLink.src;

public class LinkedList {
    class Node {
        int value;
        Node next = null;

        Node(int value) {
            this.value = value;
        }
    }

    protected Node head = null;
    protected Node tail = null;

    public void agregarValorAlInicio(int value) {
        Node nuevoNodo = new Node(value);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if (nuevoNodo.next == null) {
            tail = nuevoNodo;
        }
    }

    public void agregarTail(int value) {
        Node nuevoNodo = new Node(value);
        if (tail == null) {
            head = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
        }
    }

    public void imprimirLinkedList() {
        Node valor = head;
        while (valor != null) {
            System.out.print(valor.value + " ");
            valor = valor.next;
        }
        System.out.println();
    }

    public void agregarPorPosicion(int posicion, int valor) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            agregarValorAlInicio(valor);
        } else {
            Node node = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            //[0] -> [3] -> [5] -> [10]
            if (actual.next == null) {
                agregarTail(valor);
            } else {
                //[0] -> [3] -> [99]->[5]  -> [10]
                node.next = actual.next;
                actual.next = node;
            }
        }
    }

    public Node buscarPorPosicion(int posicion) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            return head;
        } else {
            Node actual = head;
            for (int i = 0; i < posicion; i++) {

                if (i == posicion - 1) {
                    return actual;
                }

                Node node = actual.next;
                actual = node;

            }
        }
        return null;
    }

    public boolean buscarPorContenido(int contenido) {

        Node actual = head;
        int buscar = actual.value;
        boolean cursor = true;

        while (cursor == true) {
            if (buscar == contenido) {
                break;
            } else if (actual == tail) {
                cursor = false;
                break;
            } else if (buscar != contenido) {
                Node nodo = actual.next;
                actual = nodo;
                buscar = actual.value;
            }
        }
        return cursor;
    }

    public void eliminarHead() {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        } else {
            head = head.next;
        }
    }

    public void eliminarTail() {
        if (tail == null) {
            throw new IndexOutOfBoundsException();
        } else {
            Node actual = head;
            while (actual.next != tail) {
                actual = actual.next;
            }
            actual.next = null;
            tail = actual;
        }
    }

    public void eliminarPorPosicion(int posicion) {
        if (posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if (posicion == 0) {
            eliminarHead();
        } else {
            Node actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                if (actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if (actual.next == tail) {
                eliminarTail();
            } else {
                actual.next = actual.next.next;
            }
        }
    }

}
