package lista_tutorial;

public class lista {
    int longitud;
    Nodo inicio, fin;

    public lista() {
        inicio = null;
        fin = null;
    }

    public boolean EstaVacia() {
        return inicio == null;
    }

    public void AgregarAlInicio(int elemento) {
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public void AgregarAlFinal(int elemento) {
        if (!EstaVacia()) {
            fin.siguinte = new Nodo(elemento);
            fin = fin.siguinte;
        } else {
            inicio = fin = new Nodo(elemento);
        }
    }

    public int EliminarAlinicio() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguinte;
        }
        return elemento;
    }

    public int EliminarAlFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguinte != fin) {
                temporal = temporal.siguinte;
            }
            fin = temporal;
            fin.siguinte = null;
        }
        return elemento;
    }

    public String MostrarLista() {
        StringBuilder sb = new StringBuilder();
        Nodo recorrer = inicio;
        while (recorrer != null) {
            sb.append("[").append(recorrer.dato).append("]->");
            recorrer = recorrer.siguinte;
        }
        return sb.toString();
    }

    public void MezclarListas(lista lista1, lista lista2) {
        Nodo actual1 = lista1.inicio;
        Nodo actual2 = lista2.inicio;

        while (actual1 != null || actual2 != null) {
            if (actual1 != null && (actual2 == null || actual1.dato < actual2.dato)) {
                if (!EstaEnLaLista(actual1.dato)) {
                    AgregarAlFinal(actual1.dato);
                }
                actual1 = actual1.siguinte;
            } else if (actual2 != null) {
                if (!EstaEnLaLista(actual2.dato)) {
                    AgregarAlFinal(actual2.dato);
                }
                actual2 = actual2.siguinte;
            }
        }
    }

    public boolean EstaEnLaLista(int elemento) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == elemento) {
                return true;
            }
            actual = actual.siguinte;
        }
        return false;
    }
}
