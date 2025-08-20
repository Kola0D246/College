# Java Modifiers

## Class Modifiers

1. `public` -> can be access from anywhere. there can be only one public class in a file. contain main method.
2. `private` -> can be access only within the class (do not used for top-level classes).
3. `protected` –> not valid for top-level classes.
4. `abstract` –> class cannot be instantiated (only subclassed).
5. `final` –> class cannot be subclassed.
6. `strictfp` –> ensures floating-point consistency across platforms
7. `default` -> when no modifier is given

## Feild Modifiers

1. `private`, `public`, `protected` – access control
2. `static` – shared by all instances
3. `final` – constant (value cannot change)
4. `transient` – skipped during serialization
5. `volatile` – used in multi-threading (ensures visibility)
