
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array2d) {
        for (int[] row : array2d) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int col : row) {
                sum += col;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] array) {
        int total = sum(array);
        int a = array[0].length;
        int b = array.length;
        int c = a * b;
        return (double) total / c;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] array) {
        int min = array[0][0];
        for (int[] row : array) {
            for (int col : row) {
                if (col < min) {
                    min = col;
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }


    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array) {
        int counter = 0;
        for (int[] row : array) {
            for (int col : row) {
                if (col % 2 == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] array) {
        for (int[] row : array) {
            for (int col : row) {
                if (col < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array) {
        int[] b = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            for (int j = 0; j < array[i].length; j++) {
                a += array[i][j];
            }
            b[i] = a;
        }

        return b;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array) {
        int[] c = new int[array[0].length];
        for(int j = 0; j < array[0].length; j++){
            int a = 0;
            for(int i = 0; i < array.length; i++){
                a += array[i][j];
            }
            c[j] = a;
        }
        return c;
    }

}