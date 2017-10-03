package th.ac.utcc.cpe.nantawat;

public class StackSubjectRecord {

	/**
	 * @param 5907401001 ณันธวัฒน์
	 */


		   private int maxSize;        
		   private SubjectRecord[] aSubjectRecord;
		   private int top;            
		   public StackSubjectRecord(int maxSize){
		      this.maxSize = maxSize ;            
		      aSubjectRecord = new SubjectRecord[maxSize];  
		      top = -1;                
		      }
		   public void push(SubjectRecord subjectRecord){
			   aSubjectRecord[++top] = subjectRecord;     
		      }
		   public SubjectRecord pop(){
		      return aSubjectRecord[top--];  
		      }
		   public SubjectRecord peek(){       
		      return aSubjectRecord[top];
		      }
		   public boolean isEmpty(){
		      return (top == -1);
		      }
		   public boolean isFull() {
		      return (top == maxSize-1);
		      }

	 public static void main(String []args){
		 SubjectRecord s1= new SubjectRecord();
		 SubjectRecord s2= new SubjectRecord();
		 SubjectRecord s3= new SubjectRecord();
		 
			 s1.setName("Data Structor");
			 s1.setCodeName("NC252");
			 s1.setGrade("A");
			 s1.setUnits(3);
			 
			 s2.setName("Programming");
			 s2.setCodeName("NC151");
			 s2.setGrade("B");
			 s2.setUnits(3);
			 
			 s3.setName("Advanced Programming");
			 s3.setCodeName("NC153");
			 s3.setGrade("C");
			 s3.setUnits(3);
		 
		 StackSubjectRecord stack = new StackSubjectRecord(10);
		 	stack.push(s1);
		 	stack.push(s2);
		 	stack.push(s3);
		 
		 SubjectRecord s4 = stack.pop();
		 	System.out.println(s4);
		 SubjectRecord s5 = stack.pop();
		 	System.out.println(s5);
		 SubjectRecord s6 = stack.pop();
		 	System.out.println(s6);
		 
	 }
}

	


