package echau.programming.simpleclasses;

/**
 * Lesson 15: Classes and objects
 *
 * @author Eugene Chau
 * @version June 12, 2017
 */
public class Main {
    public static void main(String[] args) {
        final Circle c = new Circle(5);
        final double area = c.area();
        System.out.println("The area of a circle with radius " + c.getRadius()
            + " is " + area);
        c.setRadius(10);
        final double newArea = c.area();
        System.out.println("The area of a circle with radius " + c.getRadius()
            + " is " + newArea);
        System.out.println("The diameter is " + c.diameter());
        
        System.out.println("");
        
        final BankAccount myAccount = new BankAccount(1000, "Eugene Chau");
        myAccount.deposit(505.22);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(100);
        System.out.println("The " + myAccount.getName() + " account balance is, $"
            + myAccount.getBalance());
        
        
        /* Exercises for Lesson 15 */
        
        //1a. Rectangle
        //1b. myRect
        //1c. double, int
        
        //2. public Rectangle(double length, int width)
        
        //3. Lunch yummy5 = new Lunch(true, 900);
        
        //4a. BankAccount
        //4b. account39
        //4c. double
        
        //5. cookie cutter; cookie
        
        //6. The constructor has void in its signature. Void is omitted in constructors.
        
        //7. a. One class, many objects
        
        //8. a. The class
        
        //9. This is not legal. When myHouse is instantiated, it passes two ints to
        //   the House constructor, but the constructor takes an int and a boolean.
        //   This code will not compile.
        
        //10a. int
        //10b. int
        //10c. double
        
        //11. Public BibleStory(String x, int y, double z)
        
        //12. var1, var2, sss
        
        //13. public void Samson(double zorro)
        //    public String getDelilah()
        //    public BibleStory(String x, int y, double z)
        
        //14. BibleStory philistine = new BibleStory("Ralph", 19, 24.18);
        
        //15. gravy.var2 = 106.9;
        
        //16. System.out.println(bart.sss);
        
        //17. String
        
        //18.
        /*
         * public class Trail {
         *     private int x;
         *     private int y;
         *     private String s;
         *     
         *     public Trail(String s) {
         *         this.x = 10;
         *         this.y = 10;
         *         this.s = s;
         *     }
         *     
         *     public String met() {
         *         return Integer.toHexString(x * y);
         *     }
         * }
         */
        
        //19. double foo = zippo.peachyDandy(10);
        
        //20. The given parameter is a double, not an int as the method calls for.
        
        
        /* Exercises for Lesson 16 */
        
        //1. true
        //2. false
        //3. false
        //4. false
        //5. false
        //6. This is illegal. method1 returns a String, not an int.
        //7. This is legal.
        //8. This is legal.
        //9. This is illegal. method3 does not take any arguments, but an int is provided.
        //10. This is illegal. The z field is private, so it cannot be changed in this way.
        //11. This is legal.
        //12. Surfer surferDude;
        //    surferDude = new Surfer();
        //13. c is correct
        //14. 2505
        //15. The fields in the BankAccount object have not been instantiated.
        //    What is the current balance?
        //16. The deposit method takes an int, not a String.
        //17. true
        //    true
        //    true
        //    true
        //    false
        
        
        /* Project: Gas Mileage */
        
        final Automobile myBmw = new Automobile(24);
        myBmw.fillUp(20);
        myBmw.takeTrip(456);
        final double fuelLeft = myBmw.reportFuel();
        System.out.println(fuelLeft);
        System.out.println(myBmw.getMileage());
        myBmw.takeTrip(100);    //will run out of fuel midway
        System.out.println(myBmw.reportFuel());
        System.out.println(myBmw.getMileage());
    }
}
