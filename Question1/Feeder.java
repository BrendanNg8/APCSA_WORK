//Brendan Ng 
public class Feeder{
    private int curr;
    public Feeder(int food){
        curr = food;
    }

    public void simulateOneDay(int numBirds){
        int chance = (int)(Math.random()*100)+1;
        if(chance>95){
            curr = 0;
        }
        else{
            int consumed = (int)(Math.random()*40)+10;
            curr -= consumed*numBirds;
            if(curr<0){
                curr = 0;
            }
        }
    }

    public int simulateManyDays(int numBirds, int numDays){
        int count = 0;
        while(curr != 0 && count <= numDays){
            simulateOneDay(numBirds);
            count++;
        }
        return count;
    }
}
