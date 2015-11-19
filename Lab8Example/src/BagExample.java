public class BagExample
{
	public BagExample(){
		//no-arg constructor
	}
   void processMessage(String msg)
   {
     Bag bag = new BagImpl();
     bag.set(msg);
     MessagePipe pipe = new MessagePipe();
     pipe.send(bag);
   }
}