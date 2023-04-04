import java.util.ArrayList;

public class Dice {

  public ArrayList<Die> dice;
  private Integer Total;

  public Dice(){
    dice = new ArrayList<Die>();
  }

  public void AddDie(Die die){
    dice.add(die);
  }

  public void AddDie(int sides){
    dice.add(new Die(sides));
  }

  public Integer GetTotal()
  {
    Total = 0;
    dice.forEach((d)->Total+=d.GetValue());
    return Total;
  }

  public void RollAllDice(){

    dice.forEach((d)->d.Roll());
  }

  public String toString(){
    String output = String.format("Dice has %d die:\n", dice.size());

    for (Die die : dice) {
      output += die.toString();
    }

    output += String.format("Total value of dice is %d", GetTotal());

    return output;
  }
}
