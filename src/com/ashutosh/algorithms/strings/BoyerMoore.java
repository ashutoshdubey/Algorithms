package com.ashutosh.algorithms.strings;

/**
 * Created by dell on 12/24/2015.
 */
//bad character heuristic
// may take O(mn) in worst case
public class BoyerMoore {
    static void badCharHeuristic( char []pat, int badchar[]) {
        int i;

        // Initialize all occurrences as -1
        for (i = 0; i < badchar.length; i++)
            badchar[i] = -1;

        // Fill the actual value of last occurrence of a character
        for (i = 0; i < pat.length; i++)
            badchar[(int) pat[i]] = i;
    }

    static void mooreSearchalgo(char []pat, char[]txt){
        int m=pat.length;
        int n=txt.length;
        int badchar[]=new int[256];
        badCharHeuristic(pat,badchar);

        int i=0;
        while(i<=(n-m)){
            int j=m-1;
            while(j>=0 && pat[j]==txt[i+j]){
                j--;
            }
            if(j<0){
                System.out.print("pattern occurs at index: "+i);
                /* Shift the pattern so that the next character in text
               aligns with the last occurrence of it in pattern.
               The condition s+m < n is necessary for the case when
               pattern occurs at the end of text */
                if(i+m<n){
                    i+=m-badchar[txt[i+m]];
                }else{
                    i+=1;
                }
            }else {
            /* Shift the pattern so that the bad character in text
               aligns with the last occurrence of it in pattern. The
               max function is used to make sure that we get a positive
               shift. We may get a negative shift if the last occurrence
               of bad character in pattern is on the right side of the
               current character. */
                i += Math.max(1, j - badchar[txt[i + j]]);
            }
        }
    }
    public static void main(String args[]){
        String txt= "ABABDABACDABABCABAB";
        String pat= "BAB";
        mooreSearchalgo(pat.toCharArray(), txt.toCharArray());
    }
}
