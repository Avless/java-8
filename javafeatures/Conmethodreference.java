package bct.javafeatures;
interface ConstructorInterface{
	Hello display(String say);
}
class Hello{
	Hello(String say) {
		System.out.println("good morning.........."+say);
	}
}

public class Conmethodreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		ConstructorInterface re=Hello::new;
re.display("how are you*********");
	}

}
