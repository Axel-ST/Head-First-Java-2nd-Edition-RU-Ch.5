/*
 * Created by Axel_ST on 05.09.2022
 *
 * Head First Java, 2nd Edition (RU) p. 149
 */

package codeMagnets;

public class MultiFor {
    public static void main(String[] args) {
        for(int x = 0; x < 4; x++) {
            for(int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            if (x == 1) {
                x++;
            }
        }
    }
}
