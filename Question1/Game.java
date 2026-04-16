import Question1.Level;
//Brendan Ng 
public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public Game(Level level1, Level level2, Level level3){
        levelOne = level1;
        levelTwo = level2;
        levelThree = level3;
    }

    public boolean isBonus(){
        return true;
    }
    public void play() {}

    public int getScore(){
        int tot = 0;
        if(levelOne.goalReached()){
            tot += levelOne.getPoints();
            if(levelTwo.goalReached()){
                tot += levelTwo.getPoints();
                if(levelThree.goalReached()){
                    tot += levelThree.getPoints();
                }
            }
        }
        if(isBonus()) {tot *= 3;}
        return tot;
    }
    public int playManyTimes(int num){
        int bestScore = 0;
        for(int i = 0; i < num; i++){
            play();
            if(getScore()>bestScore){
                bestScore = getScore();
            }
        }
        return bestScore;
    }

}