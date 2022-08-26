/*
 * Created by Axel_ST on 05.08.2022
 *
 * Head First Java, 2nd Edition (RU) p. 133
 */

package simpleDotComGame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "base passed";
            System.out.println(testResult);
        } else { // my ideas for testing all results
            System.out.println(testResult + " - hit"); // return position of fail
        }
        testResult = "failed";
        userGuess = "1";
        result = dot.checkYourself(userGuess); // check another turn
        if (result.equals("miss")) {
            testResult = "half passed";
            System.out.println(testResult);
        } else {
            System.out.println(testResult + " - miss"); // return position of fail
        }
        testResult = "failed";
        userGuess = "3";
        result = dot.checkYourself(userGuess);
        userGuess = "4";
        result = dot.checkYourself(userGuess); // check all available turns
        if (result.equals("kill")) {
            testResult = "fully passed";
        } else {
            System.out.println(testResult + " - kill");// return position of fail
        }
        System.out.println(testResult); //all great!
    }
}
