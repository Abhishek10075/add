public class add{
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed

        int number = 1;

        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
/*
public class FloydTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed

        int number = 1;

        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
Floyd's Triangle:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 


public class InvertedFloydTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed

        int number = 1;

        System.out.println("Inverted Floyd's Triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
Inverted Floyd's Triangle:
1 2 3 4 5 
6 7 8 9 
10 11 12 
13 14 
15 


public class RightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed

        System.out.println("Right-angled Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
Right-angled Triangle:
* 
* * 
* * * 
* * * * 
* * * * * 

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed

        System.out.println("Inverted Right-angled Triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
Inverted Right-angled Triangle:
* * * * * 
* * * * 
* * * 
* * 
* 

public class EquilateralTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed
        int spaces = rows - 1;

        System.out.println("Equilateral Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

Equilateral Triangle:
    *
   ***
  *****
 *******
*********

public class HollowRightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed

        System.out.println("Hollow Right-angled Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
Hollow Right-angled Triangle:
* 
* * 
*   * 
*     * 
* * * * * 

public class HollowEquilateralTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed
        int spaces = rows - 1;

        System.out.println("Hollow Equilateral Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
Hollow Equilateral Triangle:
    *
   * *
  *   *
 *     *
*********
public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed
        int spaces = rows - 1;

        System.out.println("Pyramid Pattern:");
        for (int i = 1; i <= rows; i++, spaces--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

Pyramid Pattern:
    *
   ***
  *****
 *******
*********
public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Change the number of rows as needed

        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.format("%" + (rows - i) * 2 + "s", ""); // Adjust spacing
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

Pascal's Triangle:
         1
       1   1
     1   2   1
   1   3   3   1
 1   4   6   4   1

*/