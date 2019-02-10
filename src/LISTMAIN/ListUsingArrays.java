package LISTMAIN;

public class ListUsingArrays {
    private int[] mylist;
    private int last;

    public ListUsingArrays(int[] mylist, int last) {
        this.mylist = mylist;
        this.last = last;
    }
    public void insert(int element){
        if(last<mylist.length-1){
           last++;
        mylist[last]=element;
        }
        else
            System.out.println("list is full");

    }
    public void delete(){
        if(last>=0)
        {
            mylist[last]=0;
            last--;
        }
        else
            System.out.println("list is empty");
    }
    //searching first occurence of given element
    public boolean search(int element){
        boolean re=false;
        for (int i=0;i<=last;i++)
        {
            if(mylist[i]==element) {
                re = true;
                break;
            }
        }
        return re;
    }

    public void sort() {
        for (int i = 0; i < last; i++) {
            for (int j = 0; j < last; j++) {
                int temp;
                if (mylist[j + 1] < mylist[j]) {
                    temp = mylist[j];
                    mylist[j] = mylist[j + 1];
                    mylist[j + 1] = temp;
                }
            }
        }
    }
    public void display()
        {
        System.out.println("mylist");
        for(int i=0;i<=last;i++){
            System.out.print(mylist[i]+",\t");
        }
        System.out.println();
        }


    public static void main(String[] args) {
    int size=5;
    int[] mylist1=new int[size];
    int last=-1;
    ListUsingArrays obj=new ListUsingArrays(mylist1,last);
    obj.display();
    obj.insert(205);
    obj.display();
    obj.insert(122);
    obj.display();
    obj.sort();
    obj.display();
    obj.delete();
    obj.display();
    if(obj.search(122))
        System.out.println("element found");
    else
        System.out.println("element not found");


    }




}
