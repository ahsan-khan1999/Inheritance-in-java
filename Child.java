public class Child extends Parrent{
	private String semester;
	
	public Child(){}
	public Child(String name , String id ,String semester){
	super(name,id);	
	this.semester = semester;
	
}
	public void setSem(String semester){
	this.semester = semester;
	}
	public String getSem(){
	return semester;
	}
	//@override
	
	public void displayData(){
	super.displayData();
	System.out.println(semester);
	
}
	
}