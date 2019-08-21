package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void enqueueTest_addDog() {
        Animal dog = new Animal("dog");
        AnimalShelter test = new AnimalShelter();
        assertEquals("dog is added successfully", test.enqueue(dog));
    }

    @Test
    public void enqueueTest_addCat() {
        Animal cat = new Animal("cat");
        AnimalShelter test = new AnimalShelter();
        assertEquals("cat is added successfully", test.enqueue(cat));

    }

    @Test
    public void enqueueTest_noDogOrNoCat() {
        Animal cow = new Animal("cow");
        AnimalShelter test = new AnimalShelter();
        assertEquals("it has to be either dog or cat", test.enqueue(cow));
    }

    @Test
    public void dequeueTest_removeDog() {
        Animal dog1 = new Animal("dog");
        Animal dog2  =new Animal("dog");
        AnimalShelter dogQ = new AnimalShelter();
        dogQ.enqueue(dog1);
        dogQ.enqueue(dog2);
        assertEquals("remove dog successfully", dogQ.dequeue(dog1));
    }

    @Test
    public void dequeueTest_removeCat() {
        Animal cat1 = new Animal("cat");
        Animal cat2 = new Animal("cat");
        AnimalShelter test = new AnimalShelter();
        test.enqueue(cat1);
        test.enqueue(cat2);
        assertEquals("remove cat successfully", test.dequeue(cat1));
    }

    @Test
    public void dequeueTest_removeCow() {
        Animal cow = new Animal("cow");
        AnimalShelter test = new AnimalShelter();
        test.enqueue(cow);
        assertEquals("preference is not dog or cat", test.dequeue(cow));
    }

}