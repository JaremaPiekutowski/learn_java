import java.util.*;

class MyArrays {
    public static void main(String[] args) {
        int[] myArr = { 1, 2, 3, 4, 5 };
        int[] myArr2 = myArr;

        System.out.println("Initial values:");
        System.out.println("My Arr: " + Arrays.toString(myArr));
        System.out.println("My Arr2: " + Arrays.toString(myArr2));

        myArr[0] = 10;

        System.out.println("After changing myArr[0] to 10:");
        System.out.println("My Arr: " + Arrays.toString(myArr));
        System.out.println("My Arr2: " + Arrays.toString(myArr2));
        System.out.println(
                "**Here value of c[1] is also affected "
                        + "because of Reference Data Type\n");

        String h = "Hello";
        String h2 = h;

        System.out.println("Initial values:");
        System.out.println("h: " + h);
        System.out.println("h2: " + h2);

        // Change first letter of the string h2 to "M"
        h2 = h2.replace("H", "M");

        System.out.println("After changing h to Mello:");
        System.out.println("h: " + h);
        System.out.println("h2: " + h2);
        System.out.println(
                "**Here value of h is not affected "
                        + "because of Primitive Data Type\n");
    }
}
