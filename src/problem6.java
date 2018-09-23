public class problem6 {
    public static void main(String[] args) {
        int num = 1, number = 1, cube = 1;

        System.out.printf("\n%-20s%-20s \n", "Number", "Cube");
        System.out.printf("\n%-20s%-20s \n", "------", "------");

        for (num = 1; num <= 15; num++) {

            cube = num*num*num;

            System.out.printf("\n%-20s%-20s \n", num, cube);

        }

    }
}
