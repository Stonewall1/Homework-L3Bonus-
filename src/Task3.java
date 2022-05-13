public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 23; i++) {
            StringBuilder hour = new StringBuilder(i + "");
            if(i < 10){
                hour.insert(0 , "0");
            }
            for (int j = 0; j < 60; j++) {
                StringBuilder minute = new StringBuilder(j + "");
                if(j < 10){
                    minute.insert(0 , "0");
                }
                if((hour.charAt(0) == minute.charAt(1))    &&   (hour.charAt(1) == minute.charAt(0))){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
