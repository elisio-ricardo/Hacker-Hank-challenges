package DataStructures;

public class GenericMethod {
    //Generic methods are a very efficient way to handle multiple datatypes using a single method.
    // This problem will test your knowledge on Java Generic methods.

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        GenericMethod.printArray(intArray);
        GenericMethod.printArray(stringArray);
    }

    private static <T> void printArray(T[] t) {
        for(T arr:t) { System.out.println(arr); }
    }
}
