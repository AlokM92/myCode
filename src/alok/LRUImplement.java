package alok;

import java.io.*;
import java.util.*;
public class LRUImplement {
    
     static CustomDLL list=new CustomDLL();
    int sizefinal;
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s[] =str.split(" ");
        int size= Integer.parseInt(s[0]);
        String data= s[1];
        
        for(int i=0; i<data.length(); i++){
            
            char c= data.charAt(i);
            if(c =='!')
             printCache();
            else{
                insertInCache(c,c,size);
            }
        }
        
    }
    
    static void insertInCache(int key, int value, int size){
        if(list.search(key)){
            list.delete(list.map.get(key));
            list.insert(key,value);
        }
        else{
            if(list.getSize()>=size)
                list.delete(list.map.get(list.head.key));
            list.insert(key, value);
        }
    }
    
    static void printCache(){
        list.print();
    }
}

class CustomDLL{
    private int count;
    Map<Integer, DLLNode> map = new HashMap<>();
    
    DLLNode head= null , tail= null;
    
    public boolean search(int key){
        return map.containsKey(key);
    }
    
    public int getSize(){
        return count;
    }
    
    public void insert(int key, int value){
        DLLNode node = new DLLNode(key, value);
        if(head==null  && tail==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.prev=tail;
            tail=tail.next;
            
        }
        
        count++;
        map.put(key, node);
    }
    
    public void delete(DLLNode node){
        if(node==head){
            if(head!=null){
                head=head.next;
                head.prev=null;
            }
        } else if(node==tail){
            if(tail!=null){
                tail=tail.prev;
                tail.next=null;
            }
        }
        else{
            node.prev.next= node.next;
            node.next.prev=node.prev;
        }
        
        map.remove(node.key);
        count--;
    }
    
    public void print(){
        DLLNode temp= head;
        while(temp!=null){
            System.out.print((char)temp.key);
            temp= temp.next;
        }
        System.out.print(" ");
    }
}

class DLLNode{
    int key;
    int value;
    DLLNode next;
    DLLNode prev;
    
    public DLLNode(int key, int value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}