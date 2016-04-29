/**
* Game Task
* 
* Ishaque khan jadoon
* ishaqkhan.jadoon@hotmail.com    
* 
* This is the class assignment of java to create a simple game
*/
import java.util.Scanner ;
public class Game{

public static void main ( String [] args){
        
        // object of class for getting input form user
        Scanner game = new Scanner (System.in);
        
        // player life counter 
        int count = 3;
        int numner = 0;
        do {
            
            // prompt to user for input
            System.out.println ("enter your number ") ;
            number = game.nextInt();
            
            if (number >= 0 && number <= 10) {
                
                System.out.println("You Win Tha Game ");
                break;
            } else {
                
                // Result if player lose the game
                System.out.println("you lose tha game");
                
                // if player want to paly again
                System.out.println("Do you wana play again press Y/y to play ");
                char chance = game.next().charAt(0);
        
                if (chance == 'Y' || chance == 'y') {
                    
                    // decrese the player life
                    count -- ;
           
                    if (count == 0) {
                        
                        System.out.println("you have no more chance");
                        break ;
                    }
                    // to playing game again
                    continue;
        
                }
            }
        } while(true);
    
    } // end of main method
} // end of class