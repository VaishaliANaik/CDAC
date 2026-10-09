
public class Train {

	static class Coach { 
		String id; 
		String type; 
		Coach next;
	/* TODO: constructor */ 
		Coach(String id, String type){
			this.id = id;
			this.type = type;
			this.next = next;
		}
		}
 private Coach head = new Coach("ENGINE", "ENGINE");
 private Coach tail = head;
 private int count = 0; // coaches, excluding engine
 
 public void attach(String id, String type) { 
	 /* TODO */ 
	 Coach c = new Coach(id,type);
	 if(tail == null) {
		 tail = c;
		 return;
	 }
	 
//	 if(tail == head){
//	 	head.next = c;
//	 	tail = c;
//	 	return;
//	 }
	 
	 tail.next = c;
	 tail = c;
	 }
 
 public boolean insertAfter(String afterId, String id, String type) {
 /* TODO */ 
	 Coach c = new Coach(id,type);
	 Coach temp = head;
	 
	 //1 2 3 4 5
	 while(temp.id != afterId) {
		 temp = temp.next;
	 }
	 
	 c.next = temp.next;
	 temp.next = c;
	 
	 return true;
 }
 
 public boolean detach(String id) {
	 /* TODO: find previous node */ 
	 Coach temp = head;
	 Coach prev = temp;
	 
	 if(id.equals("ENGINE")) {
		 System.out.println("Engine cant be removed");
		 return false;
	 }
	 
	 //1 2 3 4 5 
	 while(temp != null && temp.id != id) {
		 prev = temp;
		 temp = temp.next;
	 }
	 
	 prev.next = temp.next;

	 return true; 
	 }
 
 public int position(String id) {
	 /* TODO: 1 = first coach */ 
	  
	 Coach temp = head;
	 int i = 0;
	 
	 while(temp != null) {
		 if(temp.id.equals(id)) {
			 return i;
		 }
		 temp = temp.next;
		 i++;
	 }
	 return -1; 
	}
 
 public int countType(String type) {

		Coach temp = head.next;

		while(temp != null) {

			if(temp.type.equals(type)) {
				count++;
			}

			temp = temp.next;
		}

	return count;
	}
 
 public void display() { 
	 /* TODO */ 
	 Coach temp = head;
	 while(temp != null) {
		 System.out.print(temp.id + " -> ");
		 temp = temp.next;
	 }
	 System.out.print(" null ");
	 System.out.println("");
	 }
 
 public int totalCoaches() {
	 Coach temp = head.next;
	 int i = 0;
	 
	 while(temp != null) {
		 i++;
		 temp = temp.next;
	 }
	 return i; 
 }
 
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Train t = new Train();
	 	
	 	System.out.print("No Coaches : ");
	 	t.display();
	 	
	 	t.attach("S1", "SLEEPER");
	 	t.attach("S2", "SLEEPER");
	 	t.attach("S3", "SLEEPER");
	 	t.attach("GEN1", "GENERAL");
	 	
	 	System.out.print("Attached Coaches : ");
	 	t.display();
	 	
	 	t.insertAfter("S2", "PC", "PANTRY");
	 	System.out.print("Inserted After S2 : ");
	 	t.display();
	 	
	 	t.detach("S3");
	 	System.out.print("Detached S3 : ");
	 	t.display();
	 	
	 	System.out.print("CountType(SLEEPER) : " + t.countType("SLEEPER"));
	 	System.out.println("");
	 	
	 	System.out.print("Position(PC) : " + t.position("PC"));
	 	System.out.println("");
	 	
	 	System.out.print("Total Coaches : " + t.totalCoaches());
	}
}

