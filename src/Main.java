import java.util.Arrays;
public class Main {
    public static void main(String[] arg){
//        String[][] seatingChart = {
//                {"Abby", "George", "Don", "Kim"},
//                {"Brian", " Eleanor", "Harry", "Lenny"},
//                {"Cathy", "Fred", "Jill", "Matt"}};
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        seatingChart[1][2] = "Paul";
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        String temp = seatingChart[0][0];
//        seatingChart[0][0] = seatingChart[2][3];
//        seatingChart[2][3] = temp;
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        String[] temp2 = seatingChart[0];
//        seatingChart[0] = seatingChart[1];
//        seatingChart[1] = temp2;
//        for (String[] row : seatingChart){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println(seatingChart[0][2] + seatingChart[2][0]);
//
//        //Part 2
//        int [][] arr1 = new int[2][3];
//        int [][] arr2 = new int[3][2];
//        for (int[] row : arr1){
//            System.out.println(Arrays.toString(row));
//        }
//        for (int[] row : arr2){
//            System.out.println(Arrays.toString(row));
//        }
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//        arr2[0][0] = 1;
//        arr2[1][0] = 2;
//        arr2[2][0] = 3;
//        arr2[0][1] = 4;
//        arr2[1][1] = 5;
//        arr2[2][1] = 6;
//        for (int[] row : arr1){
//            System.out.println(Arrays.toString(row));
//        }
//        for (int[] row : arr2){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println(arr1[0][2] + arr2[2][0]);
//        int [][]list = {{}};
//
//        System.out.println(FunWith2DArrays.totalElements(list));
        String [][]list2 = {{"time"}}
                ;

        FunWith2DArrays.fourCorners(list2);
    }
}