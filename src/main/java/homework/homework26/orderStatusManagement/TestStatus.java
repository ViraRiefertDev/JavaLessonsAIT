package homework.homework26.orderStatusManagement;

public class TestStatus {
    public static void main(String[] args) {
        OrderStatus currentStatus = OrderStatus.PENDING;
        System.out.println(currentStatus.name()+ ": "+currentStatus.getDescription());
        if(currentStatus.canCancel()){
            System.out.println("Order can cancel");
        }
        else{
            System.out.println("Order can not cancel");
        }
    }
}
