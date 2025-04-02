package Estudos_ArvoresBinarias.Exercicio1.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    public abstract boolean equals(Object o);
    public abstract int hascode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
