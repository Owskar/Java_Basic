import javax.swing.JOptionPane;

class answer {

    static void permute(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
		
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substring  = s.substring(0, i);
            String right_substring = s.substring(i + 1);
            String rest = left_substring + right_substring;
            permute(rest, ans + ch);
        }
    }

}



class test {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("");
        String ans = "";
		
	

		answer.permute(s, ans);

    }
}