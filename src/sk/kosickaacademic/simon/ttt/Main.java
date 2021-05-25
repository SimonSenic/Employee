package sk.kosickaacademic.simon.ttt;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[15][15];
        arr = fillWithNull(arr);
        arr[0][0]=2; arr[1][1]=2; arr[2][2]=2; arr[3][3]=2; arr[4][4]=1;
        System.out.println(isWinner(arr));
    }

    public static int isWinner(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                int p = arr[i][j];
                int count=0, a=i, b=j;
                if((p==1 || p==2) && j<=10){
                    for (int k = 0; k < 5; k++) { //row
                        if (count == 0) count++;
                        else if (p == arr[a][++b]) count++;
                        if (count == 5) return p;
                    }count=0; a=i; b=j;
                }
                if((p==1 || p==2) && i<=10){
                    for(int k=0; k<5; k++){ //column
                        if(count==0) count++;
                        else if(p==arr[++a][b]) count++;
                        if(count==5) return p;
                    }count=0; a=i; b=j;
                }
                if((p==1 || p==2) && j<=10 && i<=10){
                    for(int k=0; k<5; k++){ //diagonal
                        if(count==0) count++;
                        else if(p==arr[++a][++b]) count++;
                        if(count==5) return p;
                    }count=0; a=i; b=j;
                }
                if((p==1 || p==2) && j>=5 && i>=5)
                    for(int k=0; k<5; k++){ //rev-diagonal
                        if(count==0) count++;
                        else if(p==arr[--a][--b]) count++;
                        if(count==5) return p;
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
