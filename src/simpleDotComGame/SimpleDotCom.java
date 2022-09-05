/*
 * Created by Axel_ST on 22.08.2022
 *
 * Head First Java, 2nd Edition (RU) p. 136
 */

package simpleDotComGame;

public class SimpleDotCom { // класс обработчика игры; проверяет попадания, ведет счет, выводит результат
    
    private int[] locationCells;
    private int numOfHits = 0;
    
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
        String result = "miss";
        int guess = Integer.parseInt(stringGuess);
        
        for (int cell:locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
    
        System.out.println(result);
        return result;
    }
}

