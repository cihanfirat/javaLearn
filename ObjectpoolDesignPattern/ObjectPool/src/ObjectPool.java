import java.util.LinkedList;
import java.util.Queue;

/*This class provides the basic logic of an object pool.
 The pool holds available objects in a queue structure. */

public class ObjectPool<T> {

    //Holds available objects in the pool. 
    //Objects are stored here and retrieved from this queue as they are used.
    private final Queue<T> availableObjects = new LinkedList<>();

    //Specifies the maximum limit on the number of objects in the pool. 
    //This limit is checked before a new object is created.
    private final int maxSize;

    //It is a factory interface used to create objects. 
    //It is responsible for creating objects that the pool needs.
    private final ObjectFactory<T> factory;

    //constructor
    public ObjectPool(int maxSize,ObjectFactory<T> factory){
        this.maxSize=maxSize;
        this.factory=factory;
    }

    //Takes an object from the pool. If the pool is empty and the maximum limit is not exceeded, creates a new object. 
    //When used, an object is removed from the pool.
    public T acquire(){
        if(availableObjects.isEmpty() && availableObjects.size() < maxSize){
            availableObjects.add(factory.create());
        }
        return availableObjects.poll();
    }
    //It returns the used object back to the pool so that the same object is ready for another use in the future.
    public void release(T object){
        availableObjects.offer(object);
    }

}
