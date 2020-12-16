package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];
        int bakeRowPosition = 0;
        int bakeColPosition = 0;
        int foodCount = 0;
        boolean isTrue = false;
        for (int row = 0; row < n; row++) {
            String[] input = scanner.nextLine().split("");
            for (int col = 0; col < n; col++) {
                String inputMatrix = input[col];
                matrix[row][col] = inputMatrix;
                if ("S".equals(matrix[row][col])) {
                    bakeRowPosition = row;
                    bakeColPosition = col;
                }
            }
        }

        while (isTrue == false) {
            String command = scanner.nextLine();

            switch (command) {
                case "left":
                    matrix[bakeRowPosition][bakeColPosition] = "-";
                    bakeColPosition--;
                    if (bakeColPosition < 0) {
                        isTrue = true;
                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("O")) {
                        for (int row = 0; row < n; row++) {
                            for (int col = 0; col < n; col++) {
                                if (matrix[row][col].equals("O")) {
                                    matrix[row][col] = "S";
                                    bakeRowPosition = row;
                                    bakeColPosition = col;
                                }

                            }
                        }
                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("1") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("2") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("3") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("4") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("5") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("6") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("7") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("8") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("9")) {
                        int addMoney = Integer.parseInt(matrix[bakeRowPosition][bakeColPosition]);
                        foodCount += addMoney;
                        matrix[bakeRowPosition][bakeColPosition] = "S";
                        if (foodCount >= 50) {
                            isTrue = true;
                        } else if (matrix[bakeRowPosition][bakeColPosition].equals("-")) {
                            matrix[bakeRowPosition][bakeColPosition] = "S";
                        }

                    }
                    break;
                case "right":
                    matrix[bakeRowPosition][bakeColPosition] = "-";
                    bakeColPosition++;
                    if (bakeColPosition > n - 1) {
                        isTrue = true;
                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("O")) {
                        matrix[bakeRowPosition][bakeColPosition] = "-";
                        for (int row = 0; row < n; row++) {
                            for (int col = 0; col < n; col++) {
                                if (matrix[row][col].equals("O")) {
                                    matrix[row][col] = "S";
                                    bakeRowPosition = row;
                                    bakeColPosition = col;
                                }

                            }
                        }
                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("1") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("2") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("3") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("4") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("5") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("6") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("7") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("8") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("9")) {
                        int addMoney = Integer.parseInt(matrix[bakeRowPosition][bakeColPosition]);
                        foodCount += addMoney;
                        matrix[bakeRowPosition][bakeColPosition] = "S";
                        if (foodCount >= 50) {
                            isTrue = true;
                        } else if (matrix[bakeRowPosition][bakeColPosition].equals("-")) {
                            matrix[bakeRowPosition][bakeColPosition] = "S";
                        }

                    }
                    break;

                case "down":
                    matrix[bakeRowPosition][bakeColPosition] = "-";
                    bakeRowPosition++;
                    if (bakeRowPosition > n - 1) {
                        isTrue = true;
                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("O")) {
                        matrix[bakeRowPosition][bakeColPosition] = "-";
                        for (int row = 0; row < n; row++) {
                            for (int col = 0; col < n; col++) {
                                if (matrix[row][col].equals("O")) {
                                    matrix[row][col] = "S";
                                    bakeRowPosition = row;
                                    bakeColPosition = col;
                                }

                            }
                        }

                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("1") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("2") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("3") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("4") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("5") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("6") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("7") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("8") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("9")) {
                        int addMoney = Integer.parseInt(matrix[bakeRowPosition][bakeColPosition]);
                        foodCount += addMoney;
                        matrix[bakeRowPosition][bakeColPosition] = "-";
                        if (foodCount >= 50) {
                            isTrue = true;
                        } else if (matrix[bakeRowPosition][bakeColPosition].equals("-")) {
                            matrix[bakeRowPosition][bakeColPosition] = "S";
                        }


                    }
                    break;
                case "up":
                    matrix[bakeRowPosition][bakeColPosition] = "-";
                    bakeRowPosition--;
                    if (bakeRowPosition < 0) {
                        isTrue = true;
                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("O")) {
                        matrix[bakeRowPosition][bakeColPosition] = "-";
                        for (int row = 0; row < n; row++) {
                            for (int col = 0; col < n; col++) {
                                if (matrix[row][col].equals("O")) {
                                    matrix[row][col] = "S";
                                    bakeRowPosition = row;
                                    bakeColPosition = col;
                                }

                            }
                        }
                    } else if (matrix[bakeRowPosition][bakeColPosition].equals("1") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("2") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("3") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("4") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("5") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("6") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("7") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("8") ||
                            matrix[bakeRowPosition][bakeColPosition].equals("9")) {
                        int addMoney = Integer.parseInt(matrix[bakeRowPosition][bakeColPosition]);
                        foodCount += addMoney;
                        matrix[bakeRowPosition][bakeColPosition] = "S";
                        if (foodCount >= 50) {
                            isTrue = true;
                        } else if (matrix[bakeRowPosition][bakeColPosition].equals("-")) {
                            matrix[bakeRowPosition][bakeColPosition] = "S";
                        }

                    }
                    break;
            }

            }



        if (foodCount >= 50) {
            System.out.println("Good news! You succeeded in collecting enough money!");
            System.out.println("Money: " + foodCount);
        } else {
            System.out.println("Bad news, you are out of the bakery.");
            System.out.println("Money: " + foodCount);
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]);

            }
            System.out.println();
        }
    }
}

