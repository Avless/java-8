package bct.javafeatures;
import java.util.ArrayList;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		List<String> names =new ArrayList<String>();
		names.add("selva");
		names.add("jejin");
		names.add("manoj");
		names.add("charan");
		names.add("giri");
		
		
		int count=0;
        for(String ele:names) {
            if(ele.length()<5)
                count++;
        }
            System.out.println("There are : "+ count+"String is less than 5");
            System.out.println("------------------------------------------");
            int number=(int)names.stream().filter(ele->ele.length()<5).count();
            System.out.println("There are : "+number +"String is less than 5");
	}
}
