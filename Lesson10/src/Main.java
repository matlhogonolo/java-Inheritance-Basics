
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cow braman = new cow();
		braman.setName("braman");
		
		System.out.println(braman.getName() + " " + braman.feed);

	}

}

class mammal{
	
	String feed =" breast feed";

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}
	
	
}


class cow extends mammal{
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}