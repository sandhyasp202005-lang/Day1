public class ZigZag {
    static void main(String[] args) {
        int rows = 3;
        int cols = 13;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                // Print * for zigzag: diagonals and middle row adjustments
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
