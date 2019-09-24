package code401challenges.graph;

import java.util.ArrayList;
import java.util.Set;

public class Vertex<T> {
   private T value;
   private ArrayList<Edge<T>> neightbor;
   public boolean visited;

   public Vertex(T value) {
       this.value = value;
       this.neightbor = new ArrayList<>();
   }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArrayList<Edge<T>> getNeightbor() {
        return neightbor;
    }

    public void setNeightbor(ArrayList<Edge<T>> neightbor) {
        this.neightbor = neightbor;
    }
}
