package inheritance;

public class SubEntry extends Entry {
	String definition;
	
	int year;
	
	SubEntry(String w){
		super(w);
	}
	
	SubEntry(String w , String d , int y){
		this(w);
		definition = d;
		year = y;
		
	}
	public void printView() {
		System.out.println("원어 :"+this.definition);
		System.out.println("시기 :"+this.year);
		System.out.println("약어 :"+this.word);
		
	}
}
