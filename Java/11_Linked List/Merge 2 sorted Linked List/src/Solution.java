import java.io.*;
import java.util.*;
//https://www.codingninjas.com/studio/problems/merge-two-sorted-linked-lists_800332?topList=striver-sde-sheet-problems&leftPanelTab=1
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Solution {

    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.
        if (first == null && second == null) {
            return null;
        }
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        LinkedListNode<Integer> third = new LinkedListNode(0);
        LinkedListNode<Integer> newHead = third;
        LinkedListNode<Integer> ptr1 = first;
        LinkedListNode<Integer> ptr2 = second;
        while (ptr1 != null && ptr2 != null) {
            if (ptr2.data > ptr1.data) {
                third.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                third.next = ptr2;
                ptr2 = ptr2.next;
            }
            third = third.next;
        }
        if (ptr1 != null) {
            third.next = ptr1;
        }
        if (ptr2 != null) {
            third.next = ptr2;
        }
        return newHead.next;
    }
}





