package com.luiz.natalia;

public class Display {

    public Display() {
    }

    public void showDivisibleValues(int[][] array, int divisor) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column] % divisor == 0) {
                    System.out.print(array[row][column]);

                    if ((column + 1) != array[row].length) {
                        System.out.print(", ");
                    }
                }
            }

            System.out.println();
        }
    }

    public void print(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]);

                if ((column + 1) != array[row].length) {
                    System.out.print(", ");
                }
            }
            
            System.out.println("");
        }
    }

    public void printReverse(String[][] array) {
        for(int row = array.length - 1; row >= 0; row--) {
            for(int column = array[row].length - 1; column >= 0; column--) {
                System.out.print(array[row][column]);
                
                if (column != 0) {
                    System.out.print(", ");
                }
            }

            System.out.println("");
        }
    }
}
