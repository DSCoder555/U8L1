public class Runner {
    public static void main(String arg[]){
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        // write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for (int row = 0; row < testArr1.length; row++) {
            for (int collumn = 0; collumn < testArr1[0].length; collumn++) {
                System.out.println(testArr1[row][collumn]);
            }
        }

        System.out.println("---------");
        // now, write code below that uses nested ENHANCED for loops
        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6

        /* WRITE CODE HERE! */
        for (int[] row : testArr1) {
            for (int element: row){
                System.out.println(element);
            }
        }

        System.out.println("---------");
        // lastly, write code below that uses nested INDEX-BASED for loops
        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6

        /* WRITE CODE HERE! */
        for (int collumn = 0; collumn < testArr1[0].length; collumn++) {
            for (int row = 0; row < testArr1.length; row++) {
                System.out.println(testArr1[row][collumn]);
            }
        }
        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        // write code below using a nested ENHANCED for loop to print each element in
        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish

        /* WRITE CODE HERE! */
        for (String[] row : testArr2) {
            for (String element: row){
                System.out.println(element);
            }
        }

        System.out.println("---------");
        // write code below using an INDEX-BASED nested for loop to print each element in
        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish

        /* WRITE CODE HERE! */
        for (int collumn = 0; collumn < testArr2[0].length; collumn++) {
            for (int row = 0; row < testArr2.length; row++) {
                System.out.println(testArr2[row][collumn]);
            }
        }
    }
}
