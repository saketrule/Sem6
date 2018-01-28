### Member Classes

⦁ A class can contain any number of Member Inner Classes,Every Member
inner class can directly acces both static and non-static members of outer
class
⦁ Generally a class contain both static and non-static classes but member inner classes allows only non-static members
⦁ Member Inner Class can inherit any class which is availbale to Outer Class
⦁ We can apply any access specifiers to the Member Inner Class but if the access specifier is private then we can create the object of Inner class only in
its outer class

**Assignment:** Write some program which demonstrates above two points)


### Static Inner Class

If we define any inner classes as static ,then that is known as static inner class

⦁ we can define any access specifiers before a static inner class
⦁ A static inner class can have contain static members as well as non-static
members.but Even though if you define a non-static function,it is still static.
⦁ static members of outer class are directly available to the members of static
inner class,but not non static members.to access non-static members of
outer class ,we need to create the outer class object inside the static inner
class.
Observe the following Example and try to understand the accessbility

**Assignment:** Try to trace the output of above program ,by understanding control flow.

### Local Inner Class
⦁ If we define a class inside the method(just like local variables) of another class then that class is called local inner class
⦁ Local variables of a function are not accessible from the local inner class even
though local inner class defined inside the function
⦁ Local Inner classes can't have any access specifiers
⦁ We can't create object of local Inner class inside the main of outer class.we can
create with in the same function in which it defined.

**Assignment:** Write a note in real time where exactly we can use the concept of Local Inner classes

### Anonymous Inner Class
⦁ Anonymous inner classes the inner classes defined without name.
inorder to define an anonymous inner class we definitely need an interface or
abstract class
Anonymous inner classes are two types
⦁ Member anonymous inner class
⦁ local anonymous inner class

**Assignment:** Write a Example program which demonstrates 'dynamic binding'
concept by using Anonymous Inner Class.


