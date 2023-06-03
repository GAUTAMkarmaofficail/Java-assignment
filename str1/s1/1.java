/*
1) What is String in java? What  do you mean by mutability and immutability?
*/
An object whose internal state can be changed is mutable.
On the other hand, immutable doesn't allow any change in the object once it has been created.

**************************
//Mutable and Immutable in Java

Java is an object-oriented programming language. As it is an object-oriented programming language, it's all methods and mechanism revolves around the objects. One object-based concept is mutable and immutable in Java. Objects in Java are either mutable or immutable; it depends on how the object can be iterated.

In this section, we will discuss mutable and immutable objects in Java. Further, we will see the difference between them.
//What are Mutable Objects

The mutable objects are objects whose value can be changed after initialization. We can change the object's values, such as field and states, after the object is created. For example, Java.util.Date, StringBuilder, StringBuffer, etc.

When we made a change in existing mutable objects, no new object will be created; instead, it will alter the value of the existing object. These object's classes provide methods to make changes in it.

//note=(The Getters and Setters ( get() and set() methods ) are available in mutable objects. The Mutable object may or may not be thread-safe.)

//What are Immutable Objects

The immutable objects are objects whose value can not be changed after initialization. We can not change anything once the object is created. For example, primitive objects such as int, long, float, double, all legacy classes, Wrapper class, String class, etc.

In a nutshell, immutable means unmodified or unchangeable. Once the immutable objects are created, its object values and state can not be changed.

Only Getters ( get() method) are available not Setters ( set() method) for immutable objects.

Let's see how to create classes for mutable and immutable objects.
