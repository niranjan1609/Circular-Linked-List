
public class Driver {
	public static void main(String[] args) {
		CLList list=new CLList();
		list.InsertEnd(16);
		list.insertBeg(5);
		list.insertBeg(10);
		list.insertBeg(15);
		list.InsertEnd(7);
		list.insertAfter(12, 10);
		list.InsertEnd(31);
		list.insertAfter(13, 12);
		System.out.println("List after insertion");
		list.print();
		list.SplitList();
		System.out.println("the two Lists after splitting up are followed below ");
		list.PrintFrom(CLList.Head1);
		list.PrintFrom(CLList.Head2);

		System.out.println("Deletion from the lists is followed below");
		list.DeleteNode(15);
		list.DeleteNode(7);
		list.DeletePos(3);
		list.print();

	}
}

