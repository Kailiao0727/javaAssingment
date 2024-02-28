package cz.upce.fei.zzapr.w01.codingbat.warmup1;

public class Diff21 {

    public static void main(String[] args) {
        System.out.print(Diff21.diff21(23));
    }
    public static int diff21(int n) {
        if (n >= 21){
            return 2*(n-21);
        }
        else
            return 21-n;
    }
}
