public class Task2 {
    public static void main(String[] args) {
        int result = 0;
        String mistake = "2";
        for (int i = 1; i <= 50000; i++) {
            String str = i + "";
            if(str.contains(mistake)){
                result++;
            }
        }
        System.out.println(result);
    }
}
