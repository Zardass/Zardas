package az.developia.springbook;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile(value = "development")
@Component
public class MuavinSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("muavine gonder..." + message);
    }
}
