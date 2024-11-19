                            PROTOTYPE PATTERN

- Prototype Design Pattern is used to prevent confusion that may occur during the production of similar objects that will be produced from the same class and have many common features and to reduce the production cost.

- It is used to prevent confusion and reduce production costs. It is possible to see its use especially in game software. For example, while there are hundreds of the same soldiers in a war game, only the identification numbers of these soldiers differ. Instead of creating a new soldier object each time, existing soldier objects are copied and their ID numbers are changed.

* IMPORTANT: In order to perform object copying, the Cloneable Interface is implemented and the clone method is overridden.