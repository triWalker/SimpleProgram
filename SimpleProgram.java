public class SimpleProgram
{
  String name;
  
  public SimpleProgram(String aName)
  {
    this.name = aName;
  }
  
  public String toString()
  {
    String string = "";
    string += " Hello" + " " + name + ".";
    return string;
  }
  
  public static void main(String[] args)
   {
    SimpleProgram test = new SimpleProgram("World");
    System.out.println(test);
   }
}