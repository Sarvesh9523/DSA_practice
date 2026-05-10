/*
Question 1 — Relay Race / Maximum Wins

You are given two teams, Team A and Team B, each having N runners.

A[i] represents the speed of the i-th runner of Team A
B[i] represents the speed of the i-th runner of Team B

A runner from Team A wins against a runner from Team B if:

A[i] > B[j]

Each runner can participate in at most one race.

Your task is to rearrange Team A optimally to maximize the number of wins against Team B.

Return the maximum number of races Team A can win.

📥 Input Format
N
A[0] A[1] ... A[N-1]
B[0] B[1] ... B[N-1]
📤 Output Format
Maximum number of wins
*/

import java.util.*;

public class firstQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N] ;
        int[] B = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }

        System.out.println(solve(N, A, B));
    }

    static int solve(int N, int[] A, int[] B){
        Arrays.sort(A) ;
        Arrays.sort(B) ;

        int j = 0;
        int i = 0;
        int win = 0;

        while(i < N && j<N){
            if(A[i] > B[j]){
                win++;
                i++;
                j++;
            }else{
                i++;
            }
        }
        return win ;
    }
    
}
