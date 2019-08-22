package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

public class AnimalShelter {

    Queue<Animal> dogQ = new Queue<>();
    Queue<Animal> catQ = new Queue<>();


    public String enqueue(Animal animal) {
        String message = "";
        if(animal.type == "dog") {
            dogQ.enqueue(animal);
            message = "dog is added successfully";
        } else if(animal.type == "cat") {
            catQ.enqueue(animal);
            message = "cat is added successfully";
        } else {
            throw new IllegalArgumentException("is not a preferred type");
        }
        return message;
    }

    public String dequeue(Animal animal) {
        String message = "";
        if(!animal.type.equals("dog") && !animal.type.equals("cat")) {
            throw new IllegalArgumentException( "preference is not dog or cat");
        }
         else if(animal.type == "dog"){
            dogQ.dequeue();
            message = "remove dog successfully";
        } else if(animal.type == "cat") {
            catQ.dequeue();
            message = "remove cat successfully";
        }
        return message;

    }
    
}
