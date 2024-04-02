public class BasicMaths {
    public void countdigits(String number) {
        // Divide number by 10, on each iteration it goes on number next
        int count = 0;
        long tempNumber = Long.parseLong(number);
        while(tempNumber!=0){
            tempNumber = tempNumber / 10;
            count++;
        }
        System.out.println(count);
    }
   
    public static void main(String[] args) {
       BasicMaths it = new BasicMaths();
       it.countdigits("12");
    } 
}