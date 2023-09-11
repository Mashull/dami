package features.demo92_springboot.orderModule;


import features.demo92_springboot.baseModule.User;
import features.demo92_springboot.orderModule.event.OrderEventSender;
import features.demo92_springboot.orderModule.event.UserDemandSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    UserDemandSender userDemandSender;
    @Autowired
    OrderEventSender orderEventSender;

    public long addOrder(long userId) {
        //获取用户
        User user = userDemandSender.getUser(userId);
        System.err.println("Order:User:getUser: " + user);

        //创建订单
        long orderId = System.currentTimeMillis();

        //发送事件
        orderEventSender.onCreated(orderId);

        return user.getUserId() * 10;
    }
}
