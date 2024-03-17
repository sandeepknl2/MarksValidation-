class MarksValidation {
	public static void main(String[] args) {
		
		int marks=85;
		if(marks>=1 && marks<=35) {
			System.out.println("Fail");
		}
		else if(marks >= 36 && marks<=50) {
			System.out.println("SC");
		}
		else if(marks>=51 && marks<=75) {
			System.out.println("FC");
		}
		else if(marks>= 76 && marks<=100) {
			System.out.println("FCD");
		}
		else {
			System.out.println("invalid marks ");
		}
	
	}

}