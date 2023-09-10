package demo31_api.module1;

/**
 * 通过约定保持与 Sender 相同的接口定义（或者实现 UserEventSender 接口）
 * */
public class UserEventListenerImpl {
    public void onCreated(Long userId, String name) {
        System.err.println("onCreated: userId=" + userId + ", name=" + name);
    }

    public void onUpdated(Long userId, String name) {
        System.err.println("onUpdated: userId=" + userId + ", name=" + name);
    }

    public Long getUserId(String name) {
        return Long.valueOf(name.hashCode());
    }
}
