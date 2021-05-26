package sk.kosickaacademic.simon.ttt;

public class Main {
    public static void main(String[] args) {
        Ttt ttt = new Ttt();
        int[][] arr = new int[15][15];
        arr = ttt.fillWithNull(arr);
        ttt.fillWithNumbers(arr);
    }
}
