

 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;

 public class LearnArrayList {
    public static void main(String[] args) {
//      String[] studentsName= new String[30];
//      studentsName[0]="Karshhkr";
//
//      studentsName[28]="Utkarshhkr";
//      studentsName[30]="Kiwi";


//        ArrayList<String>studentsName = new ArrayList<>();
//studentsName.add("karshkr");


        //add function

    /*    List <Integer> list= new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.add(6);//this will add 6 at end of list
        System.out.println(list);

        list.add(1,50);//this is method overloading where 50 will be add at index 1
System.out.println(list);

List<Integer> newList= new ArrayList<>();//create a new ArrayList
newList.add(140);
newList.add(150);
list.addAll(newList);//this will add the newlist to current List
        System.out.println(list);


        //get function
        System.out.println(list.get(1));// get element from any postion from list




   */

//remove function
/*
   List<Integer> list = new ArrayList<>();
   list.add(10);
   list.add(20);
   list.add(30);
   list.add(40);
   list.add(50);
   list.add(60);
   list.add(70);
   System.out.println(list);
   list.remove(1);// this will remove the element from first index
   System.out.println(list);


   list.remove(Integer.valueOf(20)); //this will remove value 20 from the list
   System.out.println(list);

list.clear();// remove all the elements from the arraylist
System.out.println(list);*/



//set function

 /*       List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        list.set(2, 500);//set the element
        System.out.println(list);*/





        //contains function
/*list.contains(50);//it checks the elements is there or not in t/f
System.out.println(list.contains(500));*/


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);


        //methods for Iteration
        for (int i = 0; i < list.size(); i++) {//tells how elements are there in the list
            System.out.println("The Element is " + list.get(i));// this will help to iterate the list
        }
         for(Integer i : list) {// using for each
             System.out.println("foreach Element is " + i);

         }
             Iterator<Integer> iterator = list.iterator();
             while(iterator.hasNext()){// itrateif there is next element
                 System.out.println("iterator" + iterator.next());
             }



    }
}
