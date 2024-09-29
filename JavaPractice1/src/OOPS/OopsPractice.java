package OOPS;

import Strings.StringsPractice;



public class OopsPractice {
    //Syntax of creating an Object:
    // class_name object_name = new class_name();
    OopsPractice S1 = new OopsPractice();


    /*
      Encapsulation:
      Encapsulation is combining/encapsulating data and functions in single unit.
      It is hiding data/functions witin a class and controlling access using access specifiers
      for example:
      class class_name
      {
      private/public/protected data members

      member functions
      }

      Example:

      class Student
      {
      private int id; // data member

      //member function
      private void display ()
      {
      System.out.print(id);
      }
     }

     */

    //New Topic

    /*
    Inheritance:
    Inheritance is creating a new class by using features of existing class
    It can be defined as deriving a child class by inheriting features of parent class
    It is used for code re-usability
     SUPER CLASS:
     public class A
     {
     ...
     }

     DERIVED CLASS/CHILD CLASS:
     public class B extends A
     {
     ...
     }
     */

    //Polymorphism

    /*
    POLYMORPHISM:
    Existing in many forms is polymorphism
    Poly refers to Many & morphism refers to FORMS.
    There are 2 types of polymorphism in Java:
    1.Compile time or static polymorphism : Overloading
    2.Runtime or Dynamic polymorphism : Overriding

    Method Overloading : Method with same name existing multiple times in same class but with different
    type of PARAMETERS
    for EG:
    class Student{
    print(marks1,marks2);
    print(id,name);
    print(grade);
    }

    Method Overriding:In Inheritance, when child class redefines the method of parent class, it's called
    method overriding
    The member function prototype or Signature must be same in child and parent class
     */


    //Abstraction
    /*
    ABSTRACTION:
    Hiding functionality /implementation and showing only necessary details is Abstraction.
    Abstact class and Interfaces are use to achieve Abstraction in Java

    Abstract method is a method without definition/body
    Class that contains at least one abstract method is Abstract class.
    Abstract class can contains abstract and Non-Abstract methods
    Abstract class and method must be declared as abstract using abstract keyword
    Abstract classes cannot be instantiated, means we can't create object of abstract class
    Only the child class of abstract class can implement the Abstract Function


     */

    //Interfaces
    
}
