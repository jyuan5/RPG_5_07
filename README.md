# RPG_5_07

# Superclass Character 
The most general superclass is Character, which has the attributes and methods that are common to every Character in the rpg. This includes the fields for health, strength, defense, and attack rate. The included methods determine whether the Character is dead or alive, can allow YoRPG to access the value of defense of the Character, and inflict damage on another Character.


# Superclass Character has two subclasses branching off: Protagonist and Monster.

Class Protagonist sets the standard values for Character's fields for its type and has two methods in which the Protagonist can change their attributes temporarily while using the methods in superclass Character.

Class Monster sets the standard values for Character's fields for its type.


# Superclass Protagonist has three subclasses that branching off: Assassin, Tank, and Warrior.

Class Assassin inherits the same members as its superclasses, but the standard values chosen in superclass Protagonist are tweaked specifically for the Assassin subclass (attack rate's value is higher).

Class Tank inherits the same members as its superclasses, but the standard vaules chosen in superclass Protagonist are tweaked specifically for the Tank subclass (defense's value is higher).

Class Warrior inherits the same members as its superclasses, but the standard vaules chosen in superclass Protagonist are tweaked specifically for the Warrior subclass (health's value is higher).


# Superclass Monster has three subclasses that branch off: Cyclops, Dragon, and Goblin.

Class Cyclops inherits the same members as its superclasses, but the standard values chosen in superclass Protagonist are tweaked specifically for the Cyclops subclass (health's value is higher; attack rate's value is lower).

Class Dragon inherits the same members as its superclasses, but the standard vaules chosen in superclass Protagonist are tweaked specifically for the Dragon subclass (health's value is higher; strength's value is higher; defense's value is higher).

Class Goblin inherits the same members as its superclasses, but the standard vaules chosen in superclass Protagonist are tweaked specifically for the Goblin subclass (health's value is higher).


Each of the classes contain a toString.
