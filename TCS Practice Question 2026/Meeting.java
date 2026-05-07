import java.util.*;

public class Meeting {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int meetingDuration = sc.nextInt();
    //     sc.nextLine(); // consume leftover newline

    //     // Read full line of batteries
    //     String[] input = sc.nextLine().split(" ");

    //     ArrayList<Integer> laptopBatteriesList = new ArrayList<>();

    //     for (String s : input) {
    //         laptopBatteriesList.add(Integer.parseInt(s));
    //     }

    //     int result = FindLaptop(meetingDuration, laptopBatteriesList);
    //     System.out.println(result);
    // }

    // static int FindLaptop(int md, ArrayList<Integer> list) {
    
    //     int count = 0;

    //     for (int e : list) {
    //         if (e >= md) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double happy = sc.nextInt(); // input
        double sad = 0;

        int iterations = 4;

        for (int i = 0; i < iterations; i++) {

            double newHappy = happy * 0.3 + sad * 0.5;
            double newSad = happy * 0.7 + sad * 0.5;

            happy = newHappy;
            sad = newSad;
        }

        // print final answer
        System.out.println(Math.round(happy) + " " + Math.round(sad));
    }

}
