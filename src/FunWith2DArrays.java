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
}
