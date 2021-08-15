class Students{
	private int Num;
	private String name;
	
	//getters and setters
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students obj=new Students();
obj.setNum(3);
obj.setName("krishi");	
System.out.println(obj.getNum());
System.out.println(obj.getName());
}

}
