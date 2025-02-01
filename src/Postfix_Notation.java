import java.util.ArrayList;

public class Postfix_Notation {
    public static void main(String[] args) {
        Process proc = new Process();
        proc.main(args);
    }
}

class Process {
    ArrayList<String> operator;
    ArrayList<String> result;
    
    public void main(String formula) {
        if (formula.length > 0) {

            for (int i = 0; i < formula[0].length(); i++) {
                char currentChar = formula[0].charAt(i);
                if (Character.isDigit(currentChar)) {
                    this.result.add(currentChar);
                };
            };
        } else {
            System.out.println("Нужно передать задачу: 1+1");
        }
    }
}