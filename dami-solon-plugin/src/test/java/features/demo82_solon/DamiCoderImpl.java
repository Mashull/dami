package features.demo82_solon;

import org.noear.dami.api.Coder;
import org.noear.dami.api.CoderDefault;
import org.noear.dami.bus.Payload;
import org.noear.solon.annotation.Component;

import java.lang.reflect.Method;

@Component
public class DamiCoderImpl implements Coder {
    Coder coder = new CoderDefault();

    @Override
    public Object encode(Method method, Object[] args) throws Throwable {
        System.out.println("编码");
        return coder.encode(method, args);
    }

    @Override
    public Object[] decode(Method method, Payload payload) throws Throwable {
        System.out.println("要解码了");
        return coder.decode(method, payload);
    }
}
