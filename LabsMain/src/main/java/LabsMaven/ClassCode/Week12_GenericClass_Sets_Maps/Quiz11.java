package LabsMaven.ClassCode.Week12_GenericClass_Sets_Maps;

import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.LinkedList;


public class Quiz11 {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("ab");
        stringStack.push("abc");
        stringStack.push("a");
        while (!stringStack.empty())
        { 
         System.out.print(stringStack.pop() + ",");
        }
    }
}