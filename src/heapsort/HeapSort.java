package heapsort;

import java.util.Scanner;

public class HeapSort {

    public static Scanner input = new Scanner(System.in);
        
    public static void buildHeap(int tab[],int last)
    {
        for(int i=(last-1)/2;i>=0;i--)
            downHeap(tab,i,last);
    }
    
    public static void downHeap(int tab[], int parent, int last)
    {
        int child = parent*2+1;
        while(child<=last)
        {
            if(child+1<=last && tab[child]<tab[child+1])
                child++;
            if(tab[parent]<tab[child])
                swap(tab,parent,child);
            parent = child;
            child=parent*2+1;
        }
    }
    
    public static void heapSort(int tab[])
    {
        int last = tab.length-1;
        buildHeap(tab,last);
        while(last>0)
        {
            swap(tab,0,last);
            last--;
            downHeap(tab,0,last);
        }
    }
    
    public static void swap(int tab[], int a, int b)
    {
        int key = tab[a];
        tab[a]=tab[b];
        tab[b]=key;
    }
    
    public static void main(String[] args) {
        
        int z;
        z=input.nextInt();
        
        for(int j = 0; j < z; j++)
        {
            int n;
            n=input.nextInt();
            int tab[] = new int[n];
       
            for(int i = 0; i < n; i++)
                tab[i]=input.nextInt();
            
            heapSort(tab);
            
            for(int i=0;i<tab.length;i++)
                System.out.print(tab[i]+", ");
            
            System.out.println();
        } 
    }
}
