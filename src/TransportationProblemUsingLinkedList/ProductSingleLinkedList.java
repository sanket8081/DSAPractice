package TransportationProblemUsingLinkedList;

public class ProductSingleLinkedList {

	ProductNode head;
	ProductNode tail;
	int size;
	public ProductNode getHead() {
		return head;
	}
	public void setHead(ProductNode head) {
		this.head = head;
	}
	public ProductNode getTail() {
		return tail;
	}
	public void setTail(ProductNode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public ProductNode createSingleLinkedList()
	{
		head = new ProductNode();
		ProductNode node = new ProductNode();
		node.setStatus("Received");
		node.setTime(0);
		node.setNext(null);
		head=node;
		tail=node;
		size=1;
		return head;
		
	}
	
	public boolean existLinkedList(ProductNode head)
	{
		if(head!=null)
			return true;
		else
			return false;
		//return head!=null;
	}
	
	public void insertNewNode(String nodeStatus,int nodeTime, int location)
	{
		if(!existLinkedList(head))
			return;
		else if(location==0)
		{
			ProductNode node = new ProductNode();
			node.setStatus(nodeStatus);
			node.setTime(nodeTime);
			node.setNext(head);
			head=node;
			
		}
		else if(location==size)
		{
			ProductNode node = new ProductNode();
			node.setStatus(nodeStatus);
			node.setTime(nodeTime);
			node.setNext(null);
			tail.setNext(node);
			tail=node;
			
		}
		else {
			ProductNode tempNode= head;
			for(int i=1;i<location;i++)
			{
				tempNode=tempNode.getNext();
			}
			ProductNode node = new ProductNode();
			node.setStatus(nodeStatus);
			node.setTime(nodeTime);
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);
		}
		setSize(getSize()+1);
	}
	
	
	public void traverseLinkedList()
	{
		if(!existLinkedList(head))
			return;
		else 
		{
			ProductNode node = head;
			while(node!=null)
			{
				System.out.println(node.getStatus());
				node = node.getNext();
			}
		}
		
		
				
	}
	
	public void getTotalTransportationCount()
	{
		if(!existLinkedList(head))
			return;
		else 
		{
			ProductNode node = head;
			int total=0;
			while(node!=null)
			{
				if(node.getStatus().equals("Transportation"))
					total+=node.getTime();
				node = node.getNext();
			}
			System.out.println("Total time taken by product is:"+total);
		}
		
		
				
	}
}
