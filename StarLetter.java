/*
 * Project Name: Star Letter
 * Created by: Mohammed Julfikar Ali Mahbub
 * Date: July 2018
 * Version: 1.0
 */

import java.util.Scanner;

public class StarLetter {
    public static String letterStar(String letter) {
        if (letter.equals("A")) {
            for (int y = 1; y < 5; y++) {
                for (int s = 1 ; s <= 4 - y; s ++) {
                    System.out.print(" ");
                }
                if (y == 3) {
                    for (int x = 1; x <= 5; x ++) {
                        System.out.print("*");
                    }
                } else {
                    for (int x = 1; x <= y; x++) {
                        System.out.print("*");
                        if ((y == 2 || y == 4) && x == 1) {
                            for (int _s = 1; _s <= (2 * (y-1) - 1); _s ++) {
                                System.out.print(" ");                        
                            }
                        }
                        if (y == 4 && x == 2) {
                            break;
                        }
                    }
                }
                System.out.println();
            }
        } else if (letter.equals("B")) {
            for (int y = 1; y < 6; y ++) {
                if (y % 2 == 1 || y == 6) {
                    System.out.print("******");
                } else {
                    System.out.print("*     *");
                }                
                System.out.println();
            }
        } else if (letter.equals("C")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 5) {
                    System.out.print(" ******");
                } else {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (letter.equals("D")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 5) {
                    System.out.print("******");
                } else {
                    System.out.print("*     *");
                }
                System.out.println();
            }
        } else if (letter.equals("E")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 5) {
                    System.out.print("*******");
                } else if (y == 3) {
                    System.out.print("*****");
                } else {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (letter.equals("F")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1) {
                    System.out.print("*******");
                } else if (y == 3) {
                    System.out.print("*****");
                } else {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (letter.equals("G")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1) {
                    System.out.print("*******");
                } else if (y == 5) {
                    System.out.print("***** *");
                } else if (y == 3) {
                    System.out.print("*  ****");
                } else if (y == 4) {
                    System.out.print("*   * *");
                } else {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (letter.equals("H")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 3) {
                    System.out.print("*******");
                } else {
                    System.out.print("*     *");
                }
                System.out.println();
            }
        }  else if (letter.equals("I")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 5) {
                    System.out.print("  ***");
                } else {
                    System.out.print("   *");
                }
                System.out.println();
            }
        } else if (letter.equals("J")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1) {
                    System.out.print("*******");
                } else if (y == 4) {
                    System.out.print("*  *");
                } else if (y == 5) {
                    System.out.print("****");
                } else {
                    System.out.print("   *");
                }
                System.out.println();
            }
        } else if (letter.equals("K")) {
            for (int y = 1; y < 6; y ++) {
                System.out.print("*");
                int d = 1, n = 7;
                if (y > 3) {
                    d = -1;
                    n = 5;
                }
                for (int s = 0; s < d * (n - 2 * y); s++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        } else if (letter.equals("L")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 5) {
                    System.out.println("*******");
                } else {
                    System.out.println("*");
                }
            }
        } else if (letter.equals("M")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1) {
                    System.out.println("**   **");
                } else if (y == 2) {
                    System.out.println("* * * *");
                } else if (y == 3) {
                    System.out.println("*  *  *");
                } else {
                    System.out.println("*     *");
                }
            }
        } else if (letter.equals("N")) {
            for (int y = 1; y < 6; y ++) {
                System.out.print("*");
                for (int x = 1; x < 6; x ++) {
                    if (x == y) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
        } else if (letter.equals("O")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 5) {
                    System.out.println(" ***** ");
                } else {
                    System.out.println("*     *");
                }
            }
        } else if (letter.equals("P")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 3) {
                    System.out.println("******");
                } else if (y == 2) {
                    System.out.println("*     *");
                } else {
                    System.out.println("*");
                }
            }
        } else if (letter.equals("Q")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1) {
                    System.out.println(" *****");
                } else if (y == 3) {
                    System.out.println("*   * *");
                } else if (y == 4) {
                    System.out.println("*    *");
                } else if (y == 5) {
                    System.out.println(" **** *");
                } else {
                    System.out.println("*     *");
                }
            }
        } else if (letter.equals("R")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 3) {
                    for (int x = 1; x < 6; x ++) {
                        System.out.print("*");
                    }
                } else if (y == 4 || y == 5) {
                    for (int x = 1; x < 6; x ++) {
                        if (x == 1 || x == y - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print("  ");
                        }
                    }
                } else {
                    System.out.print("*    *");
                }
                System.out.println();
            }
        } else if (letter.equals("S")) {
            for (int y = 1; y < 6; y ++) {
                if (y % 2 == 1) {
                    System.out.print("*******");
                } else {
                    for (int x = 1; x <= (int) Math.pow(y, y - 2); x++) {
                        if ((x == 1 && y < 4) || x == 7) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        } else if (letter.equals("T")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1) {
                    System.out.println("*******");
                } else {
                    System.out.println("   *");
                }
            }
        } else if (letter.equals("U")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 5) {
                    System.out.println(" *****");
                } else {
                    System.out.println("*     *");
                }
            }
        } else if (letter.equals("V")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 3) {
                    System.out.println(" *   *");
                } else if (y == 4) {
                    System.out.println("  * *");
                } else if (y == 5) {
                    System.out.println("   *");
                } else {
                    System.out.println("*     *");
                }
            }
        } else if (letter.equals("W")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 2) {
                    for (int x = 1; x < 8; x ++) {
                        if (x == 1 || x == 4 || x == 7) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else if (y == 3) {
                    for (int x = 1; x < 5; x ++) {
                        System.out.print("* ");
                    }
                }  else if (y == 4) {
                    System.out.print("**   **");
                } else {
                    System.out.print("*     *");
                }
                System.out.println();
            }
        } else if (letter.equals("X")) {
            for (int y = 1; y < 6; y ++) {
                System.out.print(" ");
                for (int x = 1; x < 6; x ++) {
                    if (x == y || x == (6 - y)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); 
            }
        } else if (letter.equals("Y")) {
            for (int y = 1; y < 6; y ++) {
                if (y < 4) {
                    for (int x = 1; x < 8; x ++) {
                        if (x == y || x == 8 - y) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    for (int x = 1; x < 7; x ++) {
                        if (x == 4 )
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else if (letter.equals("Z")) {
            for (int y = 1; y < 6; y ++) {
                if (y == 1 || y == 5) {
                    System.out.print("*******");
                } else {
                    for (int s = 1; s <= 7 - (y - 1) * 2; s ++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        } 
        System.out.println();
        return letter; 
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        String sac = sc.nextLine();
        StringBuilder sb;
        for (int i = 1; i <= sac.length(); i ++) {
            String temp = sac;
            sb = new StringBuilder(temp);
            sb = sb.delete(0,i-1);
            sb = sb.delete(1,sb.length());
            letterStar(sb.toString().toUpperCase());
        }
        
    }
}