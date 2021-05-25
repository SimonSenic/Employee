package sk.kosickaacademic.simon.ttt;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[15][15];
        arr = fillWithNull(arr);
        System.out.println(isWinner(arr));
    }

    public static int isWinner(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                int p = arr[i][j];
                int count=0;
                if((p==1 || p==2) && j<=10)
                    for (int k = 0; k < 5; k++) { //row
                        if (count == 5) return p;
                        if (count == 0) count++;
                        else if (p == arr[i][j++]) count++;
                    }
                if((p==1 || p==2) && i<=10)
                    for(int k=0; k<5; k++){ //column
                        if(count==5) return p;
                        if(count==0) count++;
                        else if(p==arr[i++][j]) count++;
                    }
                if((p==1 || p==2) && j<=10 && i<=10)
                    for(int k=0; k<5; k++){ //diagonal
                        if(count==5) return p;
                        if(count==0) count++;
                        else if(p==arr[i++][j++]) count++;
                    }
                if((p==1 || p==2) && j>=5 && i>=5)
                    for(int k=0; k<5; k++){ //rev-diagonal
                        if(count==5) return p;
                        if(count==0) count++;
                        else if(p==arr[i--][j--]) count++;
                    }
            }
        }
        return 0;
    }

    public static int[][] fillWithNull(int[][] arr){
        for(int i=0; i< arr.length; i++)
            for(int j=0; j<arr[0].length; j++) arr[i][j] = 0;
        return arr;
    }
}
