package com.luiz.natalia;

public class Main {
    private static final int[][] NUMBERS = {
        {   1,    2,    3,    4,    5,    6,    7},
        { 215,  520,   55,   77, 8963, 8884,  362},
        {3684, 7521, 1254, 9955, 3256, 3574,    3}
    };
    
    private static final String[][] STRINGS = {
        {   "one", "two", "three", "four", "five"},
        {"eleven", "thirteen", "fifteen", "sixteen", "seventeen"},
        {"34", "36", "37", "38", "39"}
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Display displayer = new Display();
        displayer.showDivisibleValues(NUMBERS, 3);
        System.out.println("=================================================");
        displayer.showDivisibleValues(NUMBERS, 5);
        System.out.println("=================================================");
        displayer.showDivisibleValues(NUMBERS, 2);
        System.out.println("=================================================");
        
        
        displayer.print(STRINGS);
        
        System.out.println("*************************************************");
        
        displayer.printReverse(STRINGS);
    }
}
