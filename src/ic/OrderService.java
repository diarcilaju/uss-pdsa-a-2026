package ic;

public class OrderService {
    private Database db;
    public OrderService(Database db){
        this.db=db;
    }

    public static void main(){
        OrderService order=new OrderService(new PostGresql());
        order.db.conectar("localhost");
    }
}
