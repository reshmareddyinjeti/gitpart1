package conditionalStat;

public class IfElseIfStatment {

   static int a=10;
    static int b=200;
    static int c=30;
    static int d=40;
    public static void main(String[]args)
    {
        if(a>b && a<c )
            System.out.println("a is greater");
            else
                if (b>a && b>c )
                   System.out.println("b is greater");
                else
                    if (c>d && c>b)
                        System.out.println("c is greater");
                    else
                        System.out.println("d is greater");
        }
    }
