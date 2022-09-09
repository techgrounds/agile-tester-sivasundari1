package nl.techgrounds.javatutorial;

public class JavaTutorial {
    public static void main(String[] args){
        //System.out.println("HelloWorld");
        System.out.println("Opdracht1");
        System.out.println("We use int, long to store whole numbers");
        System.out.println("We use float, double to store fractional numbers.float can store up to 7 decimal numbers and double can store upto 15 decimal numbers");
        System.out.println("Opdracht2");
        String Name="Madcatman Ben";
        int numberofcats=10;
        System.out.println(Name);
        System.out.println(numberofcats);
        System.out.println("Opdracht3");
        int newcats = numberofcats + 5;
        System.out.println("Ben buys 5 more cats , now he has :" + newcats + " cats");
        System.out.println("Opdracht4");
        System.out.println("For such a house, 4 cats is the maximum!");
        System.out.println("Opdracht5");
        float remaincats = newcats%4;
        System.out.println("Using % operator returns the division remainder, so remaining cats are " + remaincats);
        System.out.println("Opdracht6");
        int cats = 5;
        int dogs = 4;
        System.out.println("Number of cats greater than dogs : " + (cats > dogs));
        System.out.println("Number of cats less than dogs : " + (cats < dogs));
        System.out.println("Number of cats and dogs are equal : " + (cats == dogs));
        System.out.println("Number of cats and dogs are equal : " + (cats != dogs));
        System.out.println("Cats are more : " + (cats >= dogs));
        System.out.println("Cats are less : "+ (cats <= dogs));
        System.out.println("Opdracht7");
        System.out.println("Loosely typed");
        System.out.println("A loosely typed language is a programming language that does not require a variable to be defined");
        System.out.println("While working with these programming scripts, you need to use a sign for each variable type(like string, integer, float, etc.) to declare them. You just need to assign a string value to the variable, to define that our variable is an integer.");
        System.out.println("Advantages are It gives lots of flexibility that helps move faster and to change things quickly");
        System.out.println("Example are Javascript, PHP ");
        System.out.println("Strongly typed");
        System.out.println("Strongly typed is a concept used to refer to a programming language that enforces strict restrictions on intermixing of values with differing data types.");
        System.out.println("Strongly typed means, a variable will not be automatically converted from one type to another.");
        System.out.println("The advantage of strongly typed languages is that the compiler can detect when an object is being sent a message to which it does not respond. This can prevent run-time errors. The other advantages of strong typing are: earlier detection of errors speeds development.");
        System.out.println("Examples are Java, Phython");

    }

}


