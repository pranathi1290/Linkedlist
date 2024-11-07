import java.util.Scanner;

class Node{
int data;
Node next;
public Node(int data)
{
this.data=data;
}
}

public class LinkedList {
Node start;
public void create(int data) {
Node l=start;
Node newNode=new Node(data);
if(start==null) {
start=newNode;
}
else {
while(l.next != null) {
l=l.next;
}

l.next=newNode;
}
}
public void printElements() {
Node l=start;
if(start==null) {
System.out.println("no data");
}
else {
while(l!=null) {
System.out.print(l.data+"->");
l=l.next;
}
System.out.println();
}

}
public void insertAtBegin(int data)
{
Node l=start;
Node newNode=new Node(data);
if(l==null) {
start=newNode;
}
else {
newNode.next=start;
start=newNode;
}
}
public void insertAtEnd(int data) {
Node l=start;
Node newNode=new Node(data);
while(l.next!=null) {
l=l.next;
}
l.next=newNode;
}
public void insertAtMiddle(int data,int position) {
int i;
Node l=start;
Node newNode=new Node(data);
if(start==null) {
start=newNode;
}
for(i=1;i<position-1;i++) {

l=l.next;
}
newNode.next=l.next;
l.next=newNode;
}
public void deleteAtBegin() {
Node d=start;
System.out.println("data deleting "+d.data);
start=start.next;
d.next=null;

}
public void deleteAtEnd()
{
Node l=start;
if (start==null) {
System.out.println("list is empty");
}
else {
while(l.next.next!=null) {
l=l.next;
}
Node d=l.next;
System.out.println("deleted element "+d.data);
l.next=null;
}
}
public void deleteAtMiddle()
{
Node l=start;
int position;
System.out.println("enter position");
Scanner sc=new Scanner(System.in);
position=sc.nextInt();
if(start==null) {
System.out.println("Empty list");
}
else {
for(int i=1;i<position-1;i++) {
l=l.next;
}
Node d=l.next;
System.out.println("deleted element "+d.data);
l.next=d.next;
d.next=null;
}
}
public void count() {
Node l=start;
int count=0;
if(start==null) {
System.out.println("list is empty");
}
else {
while(l!=null) {
l=l.next;
count++;

}
System.out.println("count "+count);
}
}
public void search(int elem) {
Node l=start;
int f=0;
if(start==null) {
System.out.println("empty list");
}
else {
while(l.next!=null) {
if(l.data==elem) {
f=1;
break;
}
l=l.next;
}
if(f==1) {
System.out.println("element found");
}
else {
System.out.println("element not found");
}
}
}
public void sort(){
    Node pass,l;
    int temp;
    for(pass=start;pass.next!=null;pass=pass.next){
        for(l=start;l.next!=null;l=l.next){
            if(l.data>l.next.data){
                temp=l.data;
                l.data=l.next.data;
                l.next.data=temp;
               
            }
        }
    }
   
}
public void reverse(){
    Node ll=null;
    Node l=start;
    Node t=null;
    while(l!=null){
        t=l.next;
        l.next=ll;
        ll=l;
        l=t;
    }
    start=ll;
   
}



public static void main(String[] args) {
LinkedList list=new LinkedList();
list.create(10);
list.create(20);
list.create(30);
list.printElements();
list.insertAtBegin(100);
list.printElements();
list.insertAtMiddle(90, 4);
list.printElements();
list.insertAtEnd(80);
list.printElements();
list.count();
list.deleteAtBegin();
list.printElements();
list.deleteAtEnd();
list.printElements();
list.deleteAtMiddle();
list.printElements();
list.search(10);
list.sort();
list.printElements();
list.reverse();
list.printElements();
}
}
