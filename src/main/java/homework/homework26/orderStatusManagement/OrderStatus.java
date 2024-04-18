package homework.homework26.orderStatusManagement;

public enum OrderStatus {
    PENDING("Order is pending approval"){
        public boolean canCancel(){
            return true;
        }
    },
    PROCESSING("Order was accepted and is in preparation"){
        public boolean canCancel(){
            return true;
        }
    },
    SHIPPED("Order is ready and on the way to the client"){
        public boolean canCancel(){
            return false;
        }
    },
    DELIVERED("Order was successfully delivered to the client"){
        public boolean canCancel(){
            return false;
        }
    },
    CANCELLED("Oops! Order was canceled by customer or restaurant"){
        public boolean canCancel(){
            return false;
        }
    };
    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract boolean canCancel();
}
