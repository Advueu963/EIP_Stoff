package StoffZsf.DynamischeDatenstrukturen;

public class Stack implements List{
	private ListElement head;
	private int size;
	public Stack() {
		head = null;
		size = 0;
	}
	@Override
	public void append(int element) {
		// TODO Auto-generated method stub
		if(head == null) {
			head = new ListElement(element, null);
			return;
		}
		ListElement newElement = new ListElement(element, head);
		head = newElement;
	}

	@Override
	public void remove(int element) {
		if (head == null) {
			return;
		}
		// TODO Auto-generated method stub
		if ( head.getElement() == element) {
			head = head.getNext();
			size--;
		} else {
			ListElement current = head;
			while(current.getNext() != null) {
				int nextElement = current.getNext().getElement();
				if( nextElement == element) {
					size--;
					current.setNext(current.getNext().getNext());
					// We have found element and finish while-loop
					break;
				} else {
					current = current.getNext();
				}
			}
		}
		
	}

	@Override
	public void toConsole() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("This is the List: ");
		ListElement current = head;
		while(current != null) {
			if(current.getNext() == null) {
				sb.append(current.getElement() + "-> ENDE");

			} else {
				sb.append(current.getElement() + "->");

			}
			current = current.getNext();
		}
		System.out.println(sb.toString());
	}
}
