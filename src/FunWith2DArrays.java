public class FunWith2DArrays {
    public static int totalElements(int[][] test){
        return test.length * test[0].length;
    }

    public static void fourCorners(String[][] test){
        System.out.println(test[0][0]);
        System.out.println(test[0][test[0].length-1]);
        System.out.println(test[test.length-1][0]);
        System.out.println(test[test.length-1][test[0].length-1]);

    }

    public static double average(int[][] arr){
        double total = 0.0;
        int nums = arr.length * arr[0].length;
        for (int[] row : arr){
            for (int element : row){
                total += element;
            }
        }
        return total/nums;
    }

    public static int[] indexFound(String[][] arr, String target){
        for (int row = 0; row < arr.length; row++) {
            for (int collumn = 0; collumn < arr[0].length; collumn++) {
                if (arr[row][collumn].equals(target)){
                    return (new int[] {row,collumn});
                }
            }

        }
        return (new int[] {-1,-1});
    }
}
