package enums;

public class OverTimeManager {
    public static void main(String[] args) {
        // v1 //switch case를 쓸 필요 없음
        // OverTimeManager manager = new OverTimeManager();
        // int amount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        // System.out.println(amount);

        //v2
        int amount = OverTimeValues.THREE_HOUR.getAmount();
        System.out.println(amount);
    }

    // public int getOverTimeAmount(OverTimeValues value){
    //     int amount = 0;
    //     switch(value){
    //         case THREE_HOUR :
    //             amount = 18000;
    //             break;
    //         case FIVE_HOUR : 
    //             amount = 40000;
    //             break;
    //     }
    //     return amount;
    // }
}
