public class mergeLinked {
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
    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("List is Empty");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }

        }

    }

    public static mergeLinked merge(mergeLinked l1, mergeLinked l2){

        Node f=l1.head;
        Node s=l2.head;
        mergeLinked result=new mergeLinked();
        while(f!=null && s!=null){
            if(f.data<s.data){
                result.insertLast(f.data);
                f=f.next;
            }
            else{
                result.insertLast(s.data);
                s=s.next;
            }

        }
        while(f!=null){
            result.insertLast(f.data);
            f=f.next;
        }
        while(s!=null){
            result.insertLast(s.data);
            s=s.next;
        }
        return result;
    }


    public static void main(String[] args) {
        mergeLinked first=new mergeLinked();
        mergeLinked second=new mergeLinked();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        mergeLinked ans=mergeLinked.merge(first,second);
        ans.display();


    }
}
