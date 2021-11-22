public class Main {
    public static void main(String[] args) {
        int [] array = {30, 15, 40};


        try {
            array[3] = 7;
        } catch (ArrayIndexOutOfBoundsException ex) {
            array[array.length-1]=7;
            System.out.println(array[2]);

        }
    }
}
