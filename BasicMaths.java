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
    public void gcd(int number,int number2) {
        int count = 10;
        while(count!=0) {
            if(number%count==0&&number2%count==0){
                break;
            }
            count--;
            
        }
        System.out.println(count);
    }
    public void armstrongnumber(int number) {
        //Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.
        // get digits.
        int finalvalue = 0;
        int temp;
        while(number!=0) {
            temp = number%10;
            finalvalue += Math.pow(temp, 3);
            number = number / 10;
        }
        if(finalvalue==number) {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
       BasicMaths it = new BasicMaths();
    //    it.countdigits("12");
    //    it.gcd(2, 4);
       it.armstrongnumber(153);
    } 
}