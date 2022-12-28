import java.util.*; 
class Student 
{ 
    int rollno; 
    String name; 
    public void accept_details( )throws Exception 
    { 
       Scanner sc=new Scanner(System.in); 
       System.out.print("\n\n\t ENTER THE ROLLNO....."); 
       rollno=sc.nextInt( ); 
       System.out.print("\n\n\t ENTER THE NAME........"); 
       name=sc.next( ); 
   } 
   public void display_details( ) 
   { 
       System.out.print("\n\n\t ROLLNO IS...."+rollno); 
       System.out.print("\n\n\t NAME IS........"+name); 
    } 
} 
class  Test extends Student 
{ 
    int m,p,c; 
    public void accept_marks( )throws Exception 
    { 
       Scanner sc=new Scanner(System.in); 
       System.out.print("\n\n\t ENTER THE MARKS IN MATHS...."); 
       m=sc.nextInt( ); 
       System.out.print("\n\n\t ENTER THE MARKS IN PHYSICS..."); 
       p=sc.nextInt( ); 
       System.out.print("\n\n\t ENTER THE MARKS IN CHEMISTRY..."); 
       c=sc.nextInt( ); 
    } 
    public void display_marks( ) 
    { 
      System.out.print("\n\n\t MARKS IN MATHS...."+m); 
      System.out.print("\n\n\t MARKS IN PHYSICS..."+p); 
      System.out.print("\n\n\t MARKS IN CHEMISTRY..."+c); 
   } 
} 
interface Sports 
{ 
   public int spwt=5; 
   public void display_spwt( ); 
   
} 
class Result extends Test  implements Sports 
{ 
   int total; 
  public void display_spwt( ) 
  { 
    System.out.print("\n\n\t SPORTS WEIGHTAGE...."+spwt); 
  } 
  public void calculate( ) 
  { 
    total=m+p+c+spwt; 
  } 
 public void display_total( ) 
{ 
  System.out.print("\n\n\t TOTAL MARKS...."+total); 
 } 
} 
class Resultdemo  
{ 
 public static void main(String args[ ])throws Exception 
{ 
  Result r=new Result( ); 
  r.accept_details( ); 
  r.accept_marks( ); 
  r.display_details( ); 
  r.display_marks( ); 
  r.display_spwt( ); 
  r.calculate( ); 
  r.display_total( ); 
} 
} 