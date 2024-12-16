Observer Design Pattern is in the category of behavioral design patterns. This pattern ensures that when a state change occurs on an object (subject), other objects (observers) connected to it are automatically notified. In this way, a many-in-one relationship model is applied.

                    Working Principle
- Subject: Central object that tracks state changes.

- Observer: Object that listens for updates reported by Subject.

- Concrete Subject: Implementation of a Subject class whose state 
can be changed and reports observers.

- Concrete Observer: Implementation of an observer that listens for Subject updates.

                        Scenario

Consider a weather app:

Subject: Weather.

Observers: Panels that update temperature and weather information on the app screen.