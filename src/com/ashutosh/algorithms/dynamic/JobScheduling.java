package com.ashutosh.algorithms.dynamic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dell on 12/1/2015.
 */
 class Checker{
    public Comparator<Jobs> compare=new Comparator<Jobs>() {
        @Override
        public int compare(Jobs o1, Jobs o2) {
            return o1.finish-o2.finish;
        }
    };
}
 class Jobs{
    int start;
    int finish;
    int val;
    Jobs(int a,int b,int c ){
        this.start=a;
        this.finish=b;
        this.val=c;
    }
 }
public class JobScheduling {
    // Find the latest job (in sorted array) that doesn't
    // conflict with the job[i]. If there is no compatible job,
    // then it returns -1.
    static int latestNonConflict(Jobs arr[], int i){
        for (int j=i-1; j>=0; j--){
            if (arr[j].finish <= arr[i-1].start)
                return j+1;
        }
        return -1;
    }

    // A recursive function that returns the maximum possible
// profit from given array of jobs.  The array of jobs must
// be sorted according to finish time.
    static int usingRecursion(Jobs arr[], int n)
    {
        // Base case
        if (n == 1) return arr[n-1].val;

        // Find profit when current job is inclueded
        int inclProf = arr[n-1].val;
        int i = latestNonConflict(arr, n);
        if (i != -1)inclProf += usingRecursion(arr, i);
        // Find profit when current job is excluded
        int exclProf = usingRecursion(arr, n-1);


        return Math.max(inclProf, exclProf);
    }

    static int usingDynamic(Jobs []arr,int n) {
        int dyn[] = new int[n+1];
        dyn[1]=arr[0].val;

        for (int  k = 2; k <= n; k++ ) {
            int inclProf = arr[k-1].val;
            int i=latestNonConflict(arr,k);
            if (i != -1)inclProf += dyn[i];
            int exclProf = dyn[k-1];
            dyn[k]=Math.max(inclProf,exclProf);
        }
        return dyn[n];
    }

    public static void main(String args[]){
        Jobs []arr={new Jobs(3, 10, 20),new Jobs(1, 2, 50),new Jobs(6, 19, 100),new Jobs(2, 100, 200)};
        Checker check=new Checker();
        Arrays.sort(arr, check.compare);
        int ans=usingRecursion(arr, arr.length);
        //int ans=usingDynamic(arr,arr.length);
        System.out.print("The optimal profit is : "+ans);
    }
}

