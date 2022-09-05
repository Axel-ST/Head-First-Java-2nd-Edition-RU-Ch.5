/*
 * Created by Axel_ST on 26.08.2022
 *
 * Head First Java, 2nd Edition (RU) p. 140
 */

package simpleDotComGame;

public class SimpleDotComGame {
    /* основной класс;
     * выполняет запуск,
     * создает массив случайных чисел,
     * считывает пользовательский ввод;
     * выводит результат и закрывает игру
     */
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        
        while (isAlive) {
            String guess = helper.getUserInput("Enter a number: ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }
    }
}
