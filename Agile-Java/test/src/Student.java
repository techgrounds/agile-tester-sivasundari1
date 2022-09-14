class Student {

    final String name; // Moet geroepen worden in een constructor

    static String realname; // Is een object

    static int age = 0; // Is een object

    public Student(String name) { // Constructor
       this.name = name;
    }

    public Student(int age) { // Constructor
        this.name = "";
    }
}

