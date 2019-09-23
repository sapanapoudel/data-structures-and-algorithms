package code401challenges.graph;

import java.util.Set;

public class Vertex<T> {
   private T value;
   private Set<Edge<T>> neightbor;

   public Vertex(T value, Set<Edge<T>> neightbor) {
       this.value = value;
       this.neightbor = neightbor;
   }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Set<Edge<T>> getNeightbor() {
        return neightbor;
    }

    public void setNeightbor(Set<Edge<T>> neightbor) {
        this.neightbor = neightbor;
    }
}
