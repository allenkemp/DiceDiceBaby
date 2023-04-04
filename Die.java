/**
 * Die
 */
public class Die {

  private Integer dieValue;
  private Integer numSides;


  public Die(Integer sides){
    SetNumberOfSides(sides);
  }

  public Die(){
    SetNumberOfSides(6);
  }


  public Integer GetValue(){
    return(dieValue);
  }

  public void SetNumberOfSides(Integer sides){

    numSides = sides < 2 ? 2 : sides;   //    Conditional ? do if true :  do if false  
  }

  public Integer GetNumberOfSides(){
    return(numSides);
  }

  public void Roll(){
    dieValue = (int)(Math.random()*numSides)+1;
  }

  public String toString(){
    return(String.format("Die has %d sides and value is %d\n", numSides, dieValue));
  }

}

/*
 
Die myDie = new Die();

myDie.SetNumberOfSides(6);

int myInt = myDie.GetNumberOfSides();
 
 */