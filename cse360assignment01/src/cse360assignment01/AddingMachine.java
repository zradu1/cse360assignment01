package cse360assignment01;

public class AddingMachine
{
  private static int total;
  private static String output;
  
  public AddingMachine()
  {
    total = 0;  // not needed - included for clarity
    output = "0 ";
  }
  
  public int getTotal()
  {
    return total;
  }
  
  public void add(int value)
  {
	  total += value;
	  output = output + "+ " + value + " ";
  }

  public void subtract(int value)
  {
	  total -= value;
	  output = output + "- " + value + " ";
  }

  public String toString()
  {
    return output;
  }

  public void clear()
  {
	  total = 0;
	  output = "0 ";
  }
  
  public static void main(String[] args)
  {
	  AddingMachine myCalculator = new AddingMachine();
	  myCalculator.add(4); 
	  myCalculator.clear();
	  myCalculator.subtract (2); 
	  myCalculator.add(5);
	  System.out.println(myCalculator.getTotal());
	  System.out.println(myCalculator.toString());
  }
}