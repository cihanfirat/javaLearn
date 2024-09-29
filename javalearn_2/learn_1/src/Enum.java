enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class Enum {
    public static void main(String[] args){
        Level myVar = Level.HIGH;
        switch(myVar){
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
        for(Level myVarLoop : Level.values()){
            System.out.println(myVarLoop);
        }
    }
}

/*
 * Difference between Enums and Classes
An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).

An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
 */