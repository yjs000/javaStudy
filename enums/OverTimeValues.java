package enums;

public enum OverTimeValues {
    THREE_HOUR(18000),
    FIVE_HOUR(40000); //java는 무조건 ;로 끝남!!

    private final int amount;

    private OverTimeValues(int amount) {
        this.amount = amount;
    }
    public int getAmount(){
        return this.amount;
    }
    // WEEKEND_FOUR_HOUR,
    // WEEKEND_EIGHT_HOUR,
}
