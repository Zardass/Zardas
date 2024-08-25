package az.developia.springbook;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile(value = "production")
@Component
public class MudirSender implements MessageSender{

    @Override
    public void send(String message) {
        System.out.println("mudire gonder" + message);

    }
}
