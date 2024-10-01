class A
{
    A() 
    {   
        System.out.println("A constructir without parameter");
        System.out.println("Code");
    }
    A(String name) 
    {   
        this();
        System.out.println("A constructor with parameters");
        System.out.println("CodeQuotient : " + name);
    }
}

public class Main extends A
{
    Main() 
    {   
        System.out.println("main constructor without parameters");
        System.out.println("Quotient");
    }
    Main(String name) 
    {   
        this();
        System.out.println("main constrcutor with parameter");
        System.out.println("CodeQuotient : " + name);
    }
}


