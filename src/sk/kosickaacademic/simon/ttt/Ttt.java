package sk.kosickaacademic.simon.ttt;

import java.util.Scanner;

public class Ttt {
    public int isWinner(int[][] arr){
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
                if((p==1 || p==2) && j>=4 && i<=10)
                    for(int k=0; k<5; k++){ //rev-diagonal
                        if(count==0) count++;
                        else if(p==arr[++a][--b]) count++;
                        if(count==5) return p;
                    }
            }
        }
        return 0;
    }

    public void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++) System.out.print(arr[i][j] +" ");
            System.out.println();
        }System.out.println();
    }

    public int[][] fillWithNull(int[][] arr){
        for(int i=0; i< arr.length; i++)
            for(int j=0; j<arr[0].length; j++) arr[i][j] = 0;
        return arr;
    }

    public void fillWithNumbers(int[][] arr){
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        printArray(arr);
        while(true){
            System.out.println("Player " +flag +", select the position: ");
            int i = sc.nextInt();
            if(i>=arr.length || i<0){ System.out.println("System: Invalid position. "); continue; }
            int j = sc.nextInt();
            if(j>=arr[0].length || j<0 || arr[i][j]!=0){ System.out.println("System: Invalid position. "); continue; }
            arr[i][j]=flag; printArray(arr);
            if(isWinner(arr)==flag){ System.out.println("Player " +flag +" won!"); break; }
            if(flag==1) flag=2;
            else flag=1;
        }
    }
}
