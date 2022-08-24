/*
 * Created by Axel_ST on 22.08.2022
 *
 * Head First Java, 2nd Edition (RU) p. 136
 */

package simpleDotComGame;

public class SimpleDotCom {
    
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
    
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int locations[] = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        
        while (isAlive) {
            String guess = helper.getUserInput("Enter a number: ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result == "kill") {
                isAlive = false;
                System.out.println("Ypu took " + numOfGuesses + " guesses.");
            }
        }
    }
}
