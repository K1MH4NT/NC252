package th.ac.utcc.cpe.nantawat;

public class SubjectRecord {
private String name;
private String codeName;
private int units;
private String grade;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCodeName() {
	return codeName;
}
public void setCodeName(String codeName) {
	this.codeName = codeName;
}
public int getUnits() {
	return units;
}
public void setUnits(int units) {
	this.units = units;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String toString(){
	return codeName+" "+name+" "+units+" "+grade;
}
public static void main (String[]args){
	SubjectRecord sr = new SubjectRecord();
	
	sr.setName("Data Structure");
	sr.setCodeName("NC252");
	sr.setUnits(3);
	sr.setGrade("A");
	if(sr.getGrade().equals("a")){
		System.out.println("I'm so lucky. I'lv got A.");
		}
	else {
		System.out.println("Oh,I'm not that lucky.");
		
	}
}

}
