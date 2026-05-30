# Polymorphism 🌈

Polymorphism is a core concept in object-oriented programming that allows the same method or interface to work in different ways for different classes.

## What is polymorphism?
- "Poly" means many and "morph" means forms.
- It lets a single action behave differently depending on the object that performs it.
- In Java, polymorphism is usually implemented by method overloading and method overriding.

## Why do we need polymorphism?
- It improves code flexibility and reuse.
- It allows writing general code that works with objects of different types.
- It supports easier maintenance and extension of systems.
- It helps design systems using common interfaces or base classes.

## Types of polymorphism
1. Compile-time polymorphism (static polymorphism)
   - Achieved by method overloading.
   - The compiler decides which method version to call based on the method signature.
   - Example: multiple methods with the same name but different parameters.

2. Runtime polymorphism (dynamic polymorphism)
   - Achieved by method overriding.
   - The method call is resolved at runtime based on the actual object type.
   - Example: a base class reference holding a child class object.

## Notes to study
- Method overloading is about same method name, different parameters.
- Method overriding is about redefining a base class method in a derived class.
- A reference type can be a superclass while the object type can be a subclass.
- Polymorphism works best with inheritance and interfaces.
- It helps build code that is easier to extend without changing existing code.

## What to practice
- method overloading
- method overriding
- runtime polymorphism
- real-world examples like shape drawing, payment methods, animal sound

## Goal
Understand how polymorphism makes code flexible and powerful.
