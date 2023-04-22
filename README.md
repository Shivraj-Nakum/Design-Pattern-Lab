# Design-Pattern-Lab

-This course consists of LLD (low level design).

-In core java, there are mainly three types of design patterns Creational Design Pattern , Structural Design Pattern and Behavioral Design Pattern.

-This labwork is done selecting the theme as RESTAURANT for all design patterns inorder to understand the patterns much more conveniently.

## Creational Design Pattern
1) Factory Pattern 

-used for creating similar types of objects without specifying their concrete clases.

-used when objects are of same type but vary a little in terms of implimentation/data.

2) Abstract Factory Pattern

-used for creating family of similar types of objects without specifying their concrete clases.

-when we need to specify 2 things while creating object (e.g.- while creating mobile we need to specify Brand and Model_no.)

3) Builder Pattern

-clear sepration between construction and representation of object and this pattern solves the problem of complex constructors.

-for getting clear idea understand it as when output can have two parts essential and optional we use this pattern.

4) Prototype Pattern

-cloning of an existing object instead of creating new one and can also be customized as per the requirement.

-used when you want avoid multiple object creation of same instance.

5) Singleton Pattern

-class has only one instance while providing global access point to this instance.

-two types :

--eager intialization - creates object in advance , just after starting the application (i.e. object created as soon as class called)

--lazy initialization - restricts object creation until created by application code.

## Structural Design Pattern
1) Composite Design Pattern

-allows you to create hierarchical structures of objects, where individual objects and groups of objects can be treated uniformly.

-operations can be performed on the entire structure or on individual objects without having to differentiate between them explicitly.

2) Adapter Design Pattern

-allows objects with incompatible interfaces to work together by providing a bridge between them.

-converts the interface of a class into another interface that a client wants.

3) Facade Design Pattern

-provides a simplified interface to a complex subsystem of objects, acting as a unified interface that hides the complexity behind it.

4) Flywieght Dessign Pattern

-aims to optimize memory usage by sharing common data among multiple objects, reducing the memory footprint and improving performance.

-It is useful in situations where a large number of objects share similar properties and can benefit from sharing common data.

5) Decorator Design Pattern

-allows behavior to be added or modified dynamically at runtime, without changing the behavior of the base component or creating a large number of subclasses.

-It promotes flexibility and extensibility in object-oriented systems.

