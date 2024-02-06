public class duplicates {
    public int size;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    public Node head=null;
    public Node tail=null;
    public void insertFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        size++;
    }
    public void insertLast(int data){
        Node newnode=new Node(data);
        if(tail==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }
    public void insert(int data,int index){
        if(index<0||index>size){
            System.out.println("Invalid Index");
            return;
        }
        Node newnode=new Node(data);

        if(index==0){
            insertFirst(data);
        }
        if(index==size){
            insertLast(data);
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }


    }
    public void removeDuplicates(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        duplicates dp=new duplicates();
        dp.insertFirst(1);
        dp.insertLast(1);
        dp.insertFirst(2);
        dp.insertFirst(2);
        dp.insertFirst(3);
        dp.insertFirst(4);
        dp.display();
        dp.removeDuplicates();
        System.out.println("--------");
        dp.display();
    }
}
