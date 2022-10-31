import java.util.Scanner;

public class Raju implements Client{
  String name;
  double sal;

    @Override
    public void input() {
      Scanner r = new Scanner(System.in);
      System.out.println("ENTER USERNAME: ");
      name= r.nextLine();
        
      System.out.println("ENTER SALARY: ");
      sal= r.nextDouble();
        
    }

    @Override
    public void output() {
       System.out.println("NAME: "+name +" "+"SALARY: "+sal);
        
    }
    
}
