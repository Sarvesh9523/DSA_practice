/*

# 📄 Question 2 — Alternating Sign Subsequence With Bonus

You are given:

* An array `a` of `N` non-zero integers
* An integer `B`

You need to choose a subsequence such that:

* Signs strictly alternate

Valid:

```text id="jlwmu1"
+ - + -
- + - +
```

Invalid:

```text id="jlwmbh"
+ + -
- - +
```

---

# 🧮 Score Formula

If chosen subsequence length is:

```text id="jlwmsi"
L
```

then:

```text id="jlwmdh"
Score =
(sum of chosen elements)
+
B × (L - 1)
```

where:

* `L - 1` = number of alternations

---

# 🎯 Goal

Find maximum possible score.

You may also choose:

```text id="jlwmbi"
empty subsequence
```

with score:

```text id="jlwmsj"
0
```

---

## 📥 Input Format

```text id="jlwmdi"
N
B
a[0]
a[1]
...
a[N-1]
```

---

## 📤 Output Format

```text id="jlwmbj"
Maximum possible score
```

---

## ✅ Sample Test Case 1

### Input

```text id="jlwmsk"
5
10
1
-5
2
-8
3
```

### Output

```text id="jlwmdj"
33
```

---

## ✅ Sample Test Case 2

### Input

```text id="jlwmbk"
4
0
10
-20
5
-1
```

### Output

```text id="jlwmsl"
10
```

---

## ✅ Sample Test Case 3

### Input

```text id="jlwmdk"
5
5
100
10
20
30
40
```

### Output

```text id="jlwmbl"
100
```

*/

import java.util.*;

public class secondQuestion {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int N = sc.nextInt();
    // int B = sc.nextInt();

    // int[] arr = new int[N];

    // for (int i = 0; i < N; i++) {
    // arr[i] = sc.nextInt();
    // }

    // System.out.println(solve(0, arr, 0, B));
    // }
    public static int solve(int idx, int[] up, int prevSign, int B) {
        if (idx == up.length) {
            return 0;
        }
        long skip = solve(idx + 1, up, prevSign, B);
        long pick = Long.MIN_VALUE;
        int curr = up[idx];
        int currSign = (curr > 0) ? 1 : -1;
        if (prevSign == 0 || prevSign != currSign) {
            long bonus = 0;
            if (prevSign != 0) {
                bonus = B;
            }
            pick = curr + bonus + solve(idx + 1, up, currSign, B);
        }
        return Math.max((int) pick, (int) skip);
    }

    // Second and best appraoch with TC= O(n) ans SC = O(1)

    public static long solve2(int N, int B, int[] arr) {

        long NEG_INF = Long.MIN_VALUE / 2;

        // best subsequence ending with positive
        long bestPos = NEG_INF;

        // best subsequence ending with negative
        long bestNeg = NEG_INF;

        long ans = 0;

        for (int x : arr) {

            // current number is positive
            if (x > 0) {

                // start new subsequence
                long newPos = x;

                // extend negative subsequence
                if (bestNeg != NEG_INF) {
                    newPos = Math.max(newPos, bestNeg + x + B);
                }

                bestPos = Math.max(bestPos, newPos);
            }

            // current number is negative
            else {

                // start new subsequence
                long newNeg = x;

                // extend positive subsequence
                if (bestPos != NEG_INF) {
                    newNeg = Math.max(newNeg, bestPos + x + B);
                }

                bestNeg = Math.max(bestNeg, newNeg);
            }

            ans = Math.max(ans, Math.max(bestPos, bestNeg));
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve2(N, B, arr));
    }

}
