//This is a factory interface that is responsible for producing the objects needed by the pool. 
//Each object pool provides a factory that suits its needs.
//This interface defines how to create objects that are suitable for an object pool. 
//In our example, it was used to generate database connections.
public interface ObjectFactory<T> {
    T create();
}
