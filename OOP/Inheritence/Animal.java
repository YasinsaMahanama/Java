// Animal class (the base class)
class Animal {
    void animalSound() {
        System.out.println("This is an animal.");
    }
}

// Mammal class (inherits from Animal)
class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammals give birth to live young.");
    }
}

// Dog class (inherits from Mammal)
class Dog extends Mammal {
    void dogSound() {
        System.out.println("This is a dog.");
    }
}

// GoldenRetriever class (inherits from Dog)
class GoldenRetriever extends Dog {
    void retrieverSound() {
        System.out.println("This is a Golden Retriever.");
    }
}

public class Main {
    public static void main(String[] args) {
        GoldenRetriever myDog = new GoldenRetriever();

        myDog.animalSound();   // Inherited from Animal
        myDog.giveBirth();     // Inherited from Mammal
        myDog.dogSound();      // Inherited from Dog
        myDog.retrieverSound(); // Defined in GoldenRetriever
    }
}
