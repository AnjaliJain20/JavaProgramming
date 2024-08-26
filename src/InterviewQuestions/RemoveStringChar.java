package InterviewQuestions;

public class RemoveStringChar {

	public static void main(String[] args) {
		String data="Test@123Test";
		data=data.replaceAll("[0-9]", "");
		data= data.replaceAll("@","");
		System.out.println(data);
	}

}
