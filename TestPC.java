public class TestPC{
	public static void main(String[] args){
	Parrent p1 = new Parrent("KAAJK","afds62343");
	Child c1 = new Child("asdsads","rr344","fa17");
	p1.setName("sfdff");
	p1.setId("s33fdff");	
	String nameOfP = p1.getName();
	String idOfP = p1.getId();
	c1.setSem("sp18");
	String semester =  c1.getSem();
	c1.displayData();
}
}