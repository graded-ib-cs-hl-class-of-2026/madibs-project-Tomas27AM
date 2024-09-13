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
        System.out.println("Today you went to buy a " + noun1 + ". After you bought it you "  + verb1 + " away very " + adverb1 + ". You then went home so you could indulge in " + noun2 +  " but you instead craved " + noun3 + ". Out of nowhere a " + disaster1 + " killed your " + pet1 + ". To grieve the pain you went to a " + place1 + " in your Batmobile. However, you wrongly went to a " + place2 + ". Suprisingly you found " + person1 + " while you were there. They gave you a billion dollars and with this you bought a billion " + thing1 + ".");

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
