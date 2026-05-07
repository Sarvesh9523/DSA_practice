/*
### **Question 1**

Erica and Bob are competing in a hackathon by solving programming problems of three difficulty levels:

* Easy (**E**) → 1 point
* Medium (**M**) → 3 points
* Hard (**H**) → 5 points

---

### **Problem**

You are given two strings:

* `erica`
* `bob`

Each character in the string represents the type of problem solved by that person.

---

### **Task**

* Calculate the **total score** for Erica and Bob
* Return:

  * `"Erica"` if Erica has a higher score
  * `"Bob"` if Bob has a higher score
  * `"Tie"` if both scores are equal

---

### **Example 1**

**Input:**

```
erica = "E"
bob = "E"
```

**Output:**

```
Tie
```

**Explanation:**
Both solved one Easy problem → 1 point each

---

### **Example 2**

**Input:**

```
erica = "EHH"
bob = "EME"
```

**Output:**

```
Erica
```

**Explanation:**

* Erica → 1 + 5 + 5 = 11
* Bob → 1 + 3 + 1 = 5

---

### **Constraints**

* `0 < length of strings ≤ 10^5`

*/

import java.util.*;

public class Question_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string for erica: ");
        String erica = sc.nextLine() ;
        System.out.print("Enter the string for bob: ");
        String bob = sc.nextLine() ;

        System.out.println(winner(erica, bob)); 
    }

    static String winner(String erica, String bob){
        erica = erica.toUpperCase();
        bob = bob.toUpperCase();
        int ericaCount = Calculate(erica);
        int bobCount = Calculate(bob) ;

        if(ericaCount > bobCount){
            return "Erica";
        }else if(bobCount > ericaCount){
            return "Bob" ;
        }else{
            return "Tie" ;
        }
    }

    static int Calculate(String s){
        int count = 0 ;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                count  += 1 ;
            }else if(s.charAt(i) == 'M'){
                count += 3;
            }else if(s.charAt(i) == 'H'){
                count += 5;
            }else{
                count += 0;
            }
            
        }
        return count ;
    }
    
}
