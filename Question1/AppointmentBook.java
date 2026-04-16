//Brendan Ng 
public class AppointmentBook {
    private boolean isMinuteFree(int period, int minute){
        return false;
    }
    private void reserveBlock(int period, int startMinute, int duration){}

    public int findFreeBlock(int period, int duration){
        int count = 0;
        int time = 0;
        while(count < duration && time < 59){
            if(isMinuteFree(period, time)){
                count++;
            }
            else{
                count = 0;
            }
            time++;
        }
        if(count == duration){
            return time-duration;
        }
        else{
            return -1;
        }
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
        boolean taken = false;
        for(int i = startPeriod; i <= endPeriod; i++){
            if(taken == false){
                if(findFreeBlock(i, duration) != -1){
                    reserveBlock(i, findFreeBlock(i, duration), duration);
                    taken = true;
                }
            }
        }
        return taken;
    }
}