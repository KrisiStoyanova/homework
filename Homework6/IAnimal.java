package Homework6;

public interface IAnimal {

    public void makeSomeNoise();
}

abstract class Animal {
    
    public void play() {
        
    }
}

// Subclass (inherit from Animal)
class Bird extends Animal implements IAnimal  {

    public void play() {
        System.out.println("I'm bird and I'm hunting bugs!");
    }

    public void makeSomeNoise() {
        System.out.println("The bird says: tweet tweet!");
    }

    public void fly() {
        System.out.println("I'm bird and I'm flying!");
    }

    public void sync() {
        System.out.println("I'm bird and I'm singing!");
    }

abstract class Cat extends Animal implements IAnimal {

        //public void play() {
            //System.out.println("I'm cat and I'm hunting mouses!");
        //}


        //public void makeSomeNoise() {
            //System.out.println("The cat says: meow meow!");
        //}


        public void climp() {
            System.out.println("I'm cat and I'm climbing!");
        }

abstract class Dog extends Animal implements IAnimal {

            //public void play() {
                //System.out.println("I'm dog and I'm playing real hunting in the forest!");
            //}

    //public void makeSomeNoise() {
        //System.out.println("The Dog says: aw aw!");
    //}
}

public void bringStick() {
            System.out.println("I'm dog and I'm bringing back the stick!");
        }
    }
}



