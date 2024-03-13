package cz.upce.fei.zzapr.w01.codingbat.warmup1;

public class SleepIn {
    public static void main(String[] args) {
        System.out.print(SleepIn.sleepIn(true, false));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
