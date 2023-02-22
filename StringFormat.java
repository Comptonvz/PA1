package PA1_Print.src.main.java;


public class StringFormat {
public static void main(String[] args){
   String myInfo = String.format("Favorite Color: %s\nCurrent Weight: %.1f \nFirst Initial: %c\n", "blue", 170.0, 'R');
   System.out.print( myInfo );
   }
}