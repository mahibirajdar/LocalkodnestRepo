
public class Employee {

	public String name;
	public int id;
	public int age;
	public Employee(String a,int b,int c){
		if(a.length()!=0&&b>=0&&c>=20){
			name=a;
			id=b;
			age=c;
		}
		else{
			System.out.println("invalid data.............");
		}
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
		}
	public int getAge()
	{
		return age;
	}
	
		
}
