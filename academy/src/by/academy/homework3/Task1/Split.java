package by.academy.homework3.Task1;

public class Split {
    public static void main(String[] args) {

        Text1 txt = new Text1();
        String str = txt.getStr();
        String[] parts = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        char first = 0;

        for (String x : parts) {
            first = x.charAt(0);
            if (first == 'A' || first == 'a' || first == 'B' || first == 'b' || first == 'C' || first == 'c') {
                strBuilder.append(x + " ");
            }
        }
        System.out.println(strBuilder);
    }

}
