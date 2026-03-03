public class Main {

   public static void main(String []args) {
      // 4.7 WRAPPER CLASSES wrap primitives into objects 
      Integer fancyInt = new Integer(11);
      Double fancyDoub = new(4.00);
      Integer fancierInt = 11;
      System.out.println(fancierInt);

      int regularInt = fancierInt;
      System.out.println(Integer.MIN_VALUE);
      System.out.println( Integer.MAX_VALUE);
      String stringyNums = "11.0";
      double pardedD = Double.parseDouble(stringyNums);
      System.out.println(pardedD);
      String stringNums2 = "11";
      int parsedI = Integer.parseInt(stringNums2)
      System.out.println(parsedI);

//4.8 arraylist
/* arraylist is a resize collection
you can add or remove items from list
arraylist is mutable (can change during run) */
      //array list<type> name = new ArrayList<Type>();
   ArrayList<String> toDo = new ArrayList<String>();
   // for numbers, must use wrapper classes
   ArrayList<Integer> intList =new ArrayList<Integer>()
   ArrayList<Double> doubleList = new ArrayList<Double>();

   //counts amount of items to see list 
   int numTasks = toDo.size();
   System.out.println("Number of items on To Do list + numTasks");
      toDo.add("Buy apples");
      toDo.add("Buy eggs");
      toDo.add("Buy oranges");
      //check size after adding stuff
      System.out.println("Number of items after adding:" + toDo.size() );
      System.out.println(toDo); // ArrayList has a nice toString method
      // list.add( index, obj) inserts the ob)
      // AT a specific INDEX!! (posisiton)
   toDO.add( 1, "Buy garlic");
   System.out.println( toDo);
   // remember that indexes start at zero
   // so one means we added to second spot 
   
   
// list.get( int idex) returns the items 
//at that specified index
String firstItem = toDo.get(0);
// return type matches what the ArrayList holds 
System.out.println("Do this first: " + firstItem);

// list.set(int index, obj newItem)
// replaces item at the index with new one
String replaceItem = toDo set(0, "Finish Hw");
System.out.println(toDo);
System.out.println("We replaced:" + replaceItem);
String removedItem = toDo.remove(2);
System.out.println( toDo);
System.out.println('We removed the item:' + removedItem);
 
 // 4.9 arraylist transversal 
 ArrayList<Integer> scores = new ArrayList< Integer>();
 scores.add(22);
 scores.add(45);
 scores.add(78);
 System.out.println(scores);

 //enhanced for each loop
// to "visit" every item in order
// doesn't keep track of current index
for( Integer currentScore : scores ) {
System.out.printl("Test Score: " + currentScore);
}
// typical example: count all items 
double sum = 0;
for ( Integer score : scores){
   sum = sum + score; // or sum += score;
}

double avg = sum / scores.size();
System.out.println("Test Adverage " + avg);

// Standard for loop: when you need to keep
// track of current index(position)
// like if you want to use a method(set, get, ect)
for(int i = 0; i < scores.size(); i++ ) {
   int currentItem = scores.get(i);
   int curvedScore = currentItem + 100;
   scores.set(i, curvedScore);

}
System.out.println(scores);

ArrayList<String> groceries = new ArrayList<String>();
groceries.add("apple");
groceries.add("Butter");
groceries.add("orange");
groceries.add("pasta");
boolean found = false;
int index = 0;
while ( index < groceries.size() && found = false ){
   if ( "apple".equals( groceries.get(index) ) ) {
      groceries.remove(index);
      found = true;

   }
   else{
      index++;


   }

}
System.out.println(groceries);






   }
}
