public class main {





    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String value = "";
        for (int datum : data) {
            if (datum % 3 == 0 && datum % 5 == 0) {
                value = "Fizz Buzz";
                System.out.println(value);
            } else if (datum % 3 == 0) {
                value = "Fizz";
                System.out.println(value);
            } else if (datum % 5 == 0) {
                value = "Buzz";
                System.out.println(value);
            } else {
                System.out.println(datum);
            }
            ;



        }



    }
}
