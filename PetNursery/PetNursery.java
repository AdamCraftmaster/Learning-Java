public class PetNursery {
    public static void main(String []args) {

      describeAnimals();

    }

    public static void describeAnimals() {

       /* Object creation */
       Puppy myPuppy = new Puppy("tommy");
       myPuppy.setAge( 2 );
       myPuppy.getAge();

       /* Object creation */
       Kitty myKitty = new Kitty("joseph");
       myKitty.setAge(4);
       myKitty.getAge();

    }

 }