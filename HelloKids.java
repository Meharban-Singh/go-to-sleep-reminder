import java.util.*;
public class HelloKids{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Do you want to sleep?");   
        String answer = kb.nextLine();
        if(answer.equals("yes")){
            System.out.println("Good night!");
        }
        else{
            for (int i=0; i<10; i++){
                System.out.println("Too bad, GO TO SLEEEEEEEEEPPPPPP!!!"); 
            }
        }
    }
}
