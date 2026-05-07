/*
Question 2

You are given an array of n metal rod lengths. In each round, perform the following steps:

Count how many rods are currently present.
Identify the shortest rod length.
Discard all rods that have this shortest length.
Subtract the shortest length from each remaining rod and discard the offcuts.
Repeat these steps until no rods are left.
Task

Return an array where each element represents the number of rods at the start of each round.

Example

Input:
lengths = [1, 1, 3, 4]

Output:
[4, 2, 1]

Explanation

Round 1:

Rods: [1, 1, 3, 4] → Count = 4
Shortest length = 1
Remove rods of length 1 → [3, 4]
Cut remaining rods → [2, 3]

Round 2:

Rods: [2, 3] → Count = 2
Shortest length = 2
Remove rod of length 2 → [3]
Cut remaining rod → [1]

Round 3:

Rods: [1] → Count = 1
Shortest length = 1
Remove rod → []
Constraints
1 ≤ n ≤ 10^3
1 ≤ lengths[i] ≤ 10^3, where 0 ≤ i < n
Input Format
The first line contains an integer n (number of rods)
The second line contains n space-separated integers representing rod lengths

*/

import java.util.*;

public class Question_2 {

    static ArrayList<Integer> rodOffcut(ArrayList<Integer> lengths){
        Collections.sort(lengths);
        int n = lengths.size();

        ArrayList<Integer> result = new ArrayList<>();
        result.add(n);

        for(int i = 1; i < n; i++){
            if(!lengths.get(i).equals(lengths.get(i - 1))){
                result.add(n - i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // take full line input
        String input = sc.nextLine();

        String[] arr = input.split(" ");
        ArrayList<Integer> lengths = new ArrayList<>();

        for(String s : arr){
            lengths.add(Integer.parseInt(s));
        }

        ArrayList<Integer> result = rodOffcut(lengths);

        for(int val : result){
            System.out.print(val + " ");
        }
    }
}