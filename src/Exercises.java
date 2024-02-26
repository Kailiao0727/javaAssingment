public class Exercises {
    public int diff21(int n) {
        if (n >= 21){
            return 2*(n-21);
        }
        else
            return 21-n;
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
