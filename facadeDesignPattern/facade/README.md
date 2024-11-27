Facade : provides user-friendly interface, hides complexities.

This pattern used to facilitate the use of multiple subsystems, especially in large and complex systems.

Facade Class: It is a class that wraps the functionality of complex subsystems. Users (clients) access the system through this class.

Subsystems: These are the components that are covered by the Facade class and perform operations. Clients do not communicate directly with these subsystems.

Subsystems -> Light,musicsystem,securitysystem
Facade -> Controls everything above. (SmartHomeFacade)