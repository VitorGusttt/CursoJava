import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class aula1 {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
