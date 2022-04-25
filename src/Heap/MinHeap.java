package Heap;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Lalit Saini (lalitsaini85)
 * Date: 25-04-2022
 * Time: 12:50
 * File Name : Heap.java
 */
public class MinHeap {
    private ArrayList<Integer> list = new ArrayList<>();
    public void add(int item){
        this.list.add(item);
        upheapify(this.list.size()-1);
    }

    private void upheapify(int ci) { // ci -> child index
        int pi = (ci-1)/2;              // pi -> parent index
        if(this.list.get(pi) > this.list.get(ci)){
            swap(ci, pi);
            upheapify(pi);
        }
    }
     public int remove(){
        swap(0,this.list.size()-1);
        int rv = this.list.remove(this.list.size()-1);
        downHeapify(0);
        return rv;
     }

    private void downHeapify(int pi) {
        int c1 = 2*pi+1;
        int c2 = 2*pi+2;
        int minIndex = pi;
        if(c1 < this.list.size() && this.list.get(c1)<this.list.get(minIndex)){
            minIndex = c1;
        }
        if(c2 < this.list.size() && this.list.get(c2)<this.list.get(minIndex)){
            minIndex = c2;
        }
        if(minIndex != pi){
            swap(pi, minIndex);
            downHeapify(minIndex);
        }
    }

    public int getMin(){
        return this.list.get(0);
    }

    public void display(){
        System.out.println(this.list);
    }

    private void swap(int i, int j){
        int ith = this.list.get(i);
        int jth = this.list.get(j);
        this.list.set(i, jth);
        this.list.set(j, ith);
    }
}
