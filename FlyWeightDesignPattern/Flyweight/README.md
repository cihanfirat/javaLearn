                     Flyweight Design Pattern

The flyweight design pattern is in the category of structural design patterns and aims to manage many small, memorized objects through sharing. Flyweight stores only the states of objects that are actually required and shares the data that is in common. This optimizes memory usage and improves performance when working with large data sets.

    Purpose

Reduce Memory Consumption: When there are many similar objects, it prevents unnecessary memory consumption by sharing common states.

Improve Performance: It supports efficient use of system resources by ensuring that repetitive data is stored only once.

    Basic Concepts

Intrinsic State: Data that is common to all objects and shared. This data is stored in the Flyweight.

Extrinsic State: Data that is specific to the object and stored outside the flyweight class. It is calculated or transferred dynamically where it is used.

Flyweight (Shared Object): An object that is shared among multiple clients. It contains the internal state and is stored once in memory.

Flyweight Factory: A class that creates or reuses shared objects.

    Flyweight Pattern Usage Areas

Graphics Objects: Objects in 2D games (e.g. trees, rocks, etc.).

Text Rendering: Sharing fonts or character data.

Big Data Applications: Any structure that contains a lot of repeating objects.


    House Project Scenario
    
House objects have some common features (e.g. house type, wall color).
These shared features are created only once for each house.
Different features of each house (e.g. number of rooms, location) are unique to each house object.


    Explanations

IHome Interface: contains design method. This method gets details about the design of the house and prints them with shared features.

HomeConcreteFlyweight Class: Implements IEv interface and stores house type (shared state). The object of this class only keeps common features like house type. Other details of the house may be different.

HomeFactory Class: It is the factory that manages Flyweight objects. Here, each house type is created only once and then used by taking from the pool. If the same house type is requested, a new object is not created, the existing object is used.

App Class: This class creates different house types (e.g. "Villa", "Apartment", "Duplex") and designs them with different details. Since house types are shared, objects can be reused for houses of the same type.
