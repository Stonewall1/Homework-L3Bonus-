public class Task4 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 99999; i++) {
            String tech = i + "";
            if(tech.contains("13") || tech.contains("4")){
                result++;
            }
        }
        System.out.println(result);
    }
}
