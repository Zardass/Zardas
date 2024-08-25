package az.developia.springbook.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//@EnableScheduling
//@Configuration
public class SchedulerConfig {

  //  @Scheduled(fixedDelay = 2000,initialDelay = 100_000)
    public void scheduler(){

        System.out.println("zerda is writing the code...");
    }
}
