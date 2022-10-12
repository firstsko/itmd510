
//Dog class (extends) Animal class
public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof");
    }
    public static void main(String args[]){
        Animal obj = new Dog();
        obj.makeSound();
    }
}