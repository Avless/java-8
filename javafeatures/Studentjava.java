package bct.javafeatures;
interface Myinterface {
	public void display ();
	
}

class Add {
	static int add(int n1,int n2) {
		System.out.println(" addition of two numbers "+(n1+n2));
		return 0;
		
	}
}

public class Studentjava {

	  public void mymethod() {
          System.out.println("Instance Method");
          System.out.println("-----------I have been referenced by the abstract-------------");
      }
   public static void main(String[] args) {
       // TODO Auto-generated method stub
      Studentjava ob=new Studentjava();
      Myinterface re=ob::mymethod;
      re.display();
      Add ab=new Add();
      ab.add(12,34);

	}

}
