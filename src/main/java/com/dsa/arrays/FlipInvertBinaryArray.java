package arrays;

public class FlipInvertBinaryArray {
    public static int[][] flipAndInvertImage(int[][] image) {
        int colLen = image[0].length;
        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < ((colLen + 1) / 2); col++) {
                if (col == colLen / 2) {
                    image[row][col] = (image[row][col] == 1) ? 0 : 1;
                    continue;
                }
                int tmp1 = image[row][col] ^ 1;
                int tmp2 = image[row][colLen - col - 1] ^ 1;
                image[row][col] = tmp2;
                image[row][colLen - col - 1] = tmp1;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        flipAndInvertImage(arr);
    }
}
