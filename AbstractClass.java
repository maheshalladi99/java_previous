package com.maheshalladi;
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
  /*  class AbstractClass{
        public static void main(String[] args) {
            animal myObj=new animal();

        }
    }
*/  //showing an error
// inorder to access the abstract classes we need to follow the inheritance and then we can able to access the abstracts

// Subclass (inherit from Animal)
    class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}
    class AbstarctClass{
      public static void main(String[] args) {
         Pig myObj=new Pig();
         myObj.sleep();
         myObj.animalSound();


      }
  }
