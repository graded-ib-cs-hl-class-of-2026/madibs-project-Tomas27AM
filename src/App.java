import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();
      

        
    }
    public String getUserName(){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter your name: ");
   return scanner.nextLine();
    }
   




   public void printGreeting(String userName){
   System.out.println("Hello," + userName + "!");

   }

    public void printInstructions(){
 System.out.println("To play this game you have to fill in the boxes with words that corresponds with what is asked.");

    }
          
    public void doMadlib() {
        Scanner scan = new Scanner(System.in);
        String red = "\u001B[38;2;240;30;10;48;2;255;255;255m";
        String green = "\u001B[38;2;40;230;80;48;2;220;25;230m";
        String purple = "\u001B[38;2;160;32;240;48;2;255;160;0m";
        String cyan = "\u001B[38;2;0;255;255;48;2;1;121;111m";
        String yellow = "\u001B[38;2;223;211;30;48;2;20;35;245m";
        String reset = "\u001B[0m";
        String blue = "\u001B[38;2;22;75;205;48;2;180;255;30m"; 

        System.out.println("Enter a Noun ");
        String noun1 = scan.nextLine();
        System.out.println("Enter a verb (past tense) ");
        String verb1 = scan.nextLine();
        System.out.println("Enter a adverb ");
        String adverb1 = scan.nextLine();
        System.out.println("Enter a Noun (plural) ");
        String noun2 = scan.nextLine();
        System.out.println("Enter a Noun (plural) ");
        String noun3 = scan.nextLine();
        System.out.println("Enter a Natural disaster ");
        String disaster1 = scan.nextLine();
        System.out.println("Enter a pet");
        String pet1 = scan.nextLine();
        System.out.println("Enter a place");
        String place1 = scan.nextLine();
        System.out.println("Enter a place");
        String place2 = scan.nextLine();
        System.out.println("Enter a person");
        String person1 = scan.nextLine();
        System.out.println("Enter a physical thing (plural)");
        String thing1 = scan.nextLine();
        System.out.println("Today you went to buy a " + red + noun1 + reset +  ". After you bought it you " + blue + verb1 + reset + " away very " + green + adverb1 + reset + ". You then went home so you could indulge in " + blue + noun2 + reset +  " but you instead craved " + blue + noun3 + reset + ". Out of nowhere a " + red + disaster1 + reset + " killed your "+ cyan + pet1 + reset +". To grieve the pain you went to a " + purple + place1 + reset + " in your Batmobile. However, you wrongly went to a " + purple + place2 + reset + ". Suprisingly you found "+ cyan + person1 + reset +" while you were there. They gave you a billion dollars and with this you bought a billion " + yellow + thing1 + reset + ".");

    }

    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 
    
    
    
    
    
     
    
  

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
