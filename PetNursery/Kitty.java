public class Kitty {
    int KittyAge;
 
    public Kitty(String name) {
       // This constructor has one parameter, name.
       System.out.println("Name chosen is :" + name );
    }
 
    public void setAge( int age ) {
       KittyAge = age;
    }
 
    public int getAge( ) {
       System.out.println("Kitty's age is :" + KittyAge );
       return KittyAge;
    }
 }