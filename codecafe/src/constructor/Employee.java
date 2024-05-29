package constructor;

public class Employee {

 private int  eid;
 private String ename;
 
 public Employee()
 {
	// this(100,"Bhava");
	// System.out.println("Default constructor has been called");
 }
 public Employee(int eid,String ename)
 {
	 this.eid=eid;
	 this.ename=ename;
 }
 public int getEid() { 
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return ename;
}
public void setName(String name) {
	this.ename = name;
}

public String toString() {
	return "Employee [eid="+eid+",ename="+ename+ "]";
}
}


	


