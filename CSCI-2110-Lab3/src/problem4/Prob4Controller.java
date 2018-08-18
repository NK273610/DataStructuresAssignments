package problem4;

public class Prob4Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          GenericQueue<String> queue1=new GenericQueue<String>();      //Object queue1 created of string type
          queue1.enqueue("Nikhil");                                    //items added in queue1
          queue1.enqueue("Prerna");
          queue1.enqueue("Pratyusa");
          GenericQueue<Integer> queue2=new GenericQueue<Integer>();    //object queue2 created of integer type
          queue2.enqueue(1);                                           //items added in queue2
          queue2.enqueue(2);
          queue2.enqueue(3);
          
          queue1.dequeue();                                             //item remove from queue1
          queue2.dequeue();                                             //item removed from queue2
          System.out.println(queue1.toString());                        //print queue1
          System.out.println(queue2.toString());                        //print queue2
          
          System.out.println(queue1.intPositionOf("Prerna"));           //position of an element in queue1
          System.out.println(queue2.intPositionOf(2));                  //position of element in queue2
          
          System.out.println(queue1.peek());                            //peek function called for queue1
          System.out.println(queue2.peek());                            //peek function called queue2
          
        
          System.out.println(queue1.toString());                         //print queue1
          
          System.out.println(queue2.isEmpty());                          //print queue2
          
          System.out.println(queue1.first());                            //first function called and printed
          System.out.println(queue1.next());                             //next function called and printed
           
	}

}
