class Solution {
    public int reverse(int x) {
        long reverse=0l;
        while(x!=0){
            int rem=x%10;
            reverse=reverse*10+rem;
            x/=10;
        }
        if(reverse<Integer.MIN_VALUE || reverse>Integer.MAX_VALUE ){
            return 0;
        }
        return (int) reverse;
    }
}

// Without long and overflow check before reversing

// class Solution {
//     public int reverse(int x) {
//         int reverse = 0;

//         while (x != 0) {
//             int rem = x % 10;
//             x /= 10;

//             // Check positive overflow
//             if (reverse > Integer.MAX_VALUE / 10 ||
//                 (reverse == Integer.MAX_VALUE / 10 && rem > 7)) {
//                 return 0;
//             }

//             // Check negative overflow
//             if (reverse < Integer.MIN_VALUE / 10 ||
//                 (reverse == Integer.MIN_VALUE / 10 && rem < -8)) {
//                 return 0;
//             }

//             reverse = reverse * 10 + rem;
//         }

//         return reverse;
//     }
// }
