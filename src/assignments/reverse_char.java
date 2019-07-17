package assignments;

public class reverse_char {

	public static void main(String[] args) {

		String s = "I love my India";
		String[] parts = s.split(" ");
		for (int i = 0; i < parts.length; i++) {
			for (int j = parts[i].length() - 1; j >= 0; j--) {
				System.out.print(parts[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
