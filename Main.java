public class Array {

    public static void main(String[] args) {
        int[][][][] a = {
            {
                {{10, 20}, {30, 40, 50, 60}, {70, 80, 90}}
            }
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    for (int l = 0; l < a[i][j][k].length; l++) {
                        System.out.print(a[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
