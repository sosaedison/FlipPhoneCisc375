/**
 * This test class creates a new keypad that uses an instance of
 * the Digits class to map key presses to characters (digits). 
 * @author Brad Richards
 * @version 2009.9.13
 *
 */
public class TestKeypad {
   public static void main(String[] args) {
       Keypad digitPad = new Keypad(new Digits(), "Digits");
   }
}