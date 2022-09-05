/*
 * Created by Axel_ST on 05.09.2022
 *
 * Head First Java, 2nd Edition (RU) p. 148
 */

package beTheCompiler;

public class Output {
    
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }
    
    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
