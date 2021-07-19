package TransportationProblemUsingLinkedList;

public class ProductMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductSingleLinkedList p = new ProductSingleLinkedList();
		
		 p.createSingleLinkedList();
		p.insertNewNode("Confirmation", 3, 1);
		p.insertNewNode("Transportation", 10, 2);
		p.insertNewNode("Storing", 2, 3);
		p.insertNewNode("Transportation", 7, 4);
		p.insertNewNode("Distribution", 6, 4);
		p.traverseLinkedList();
		p.getTotalTransportationCount();
	}

}
