// public == access modifier which means that this class is visible
//   to all other classes
// class == keyword used to declare a class in Java
// static == this method is a class method
// void == this method has no return value
// main == name of the method. Java program processing starts from the
//    main() method which is a mandatory part of every Java program
// String[] args == this method accepts a single argument: an array of
//   elements of type String (the main method could take any number of String arguments)
// System.out.println -> prints "Hello, World" to the terminal window.

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is Jarema starting to work with Java!");

        // Boolean
        boolean isJavaFun = true;
        System.out.println(isJavaFun);

        // Integer
        int myNum = 5;
        System.out.println("My number is: " + myNum);

        // Character
        char myLetter = 'D';
        System.out.println("My letter is: " + myLetter);

        // String
        String myText = "Hello World";
        System.out.println("My text is: " + myText);

        // Array
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }

        // Print array length
        System.out.println(cars.length);
    }
}
