import java.util.ArrayList;

public class DiceDiceBaby {
  public static void main(String[] args) {
    
    Dice myDice = new Dice();

    myDice.AddDie(6);
    myDice.AddDie(6);
    myDice.AddDie(6);
    myDice.AddDie(20);

    myDice.RollAllDice();
    myDice.GetTotal();
    System.out.println(myDice.toString());

    

    //define dice

    //get user input for building dice

    // do loop to roll dice

    // clean up and exit
    
    
  }
}
