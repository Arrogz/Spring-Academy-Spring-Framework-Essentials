package rewards;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import rewards.TestInfrastructureConfig;

public class RewardNetworkTests {

    private ConfigurableApplicationContext context;
    private RewardNetwork rewardNetwork;

    @org.junit.jupiter.api.BeforeEach
    public void setUp(){
        // ConfigurableApplicationContext context = SpringApplication.run(testInfrastructureConfig.class);
        // rewardNetwork = context.getBean("rewardNetwork", RewardNetwork.class);
        this.context = SpringApplication.run(TestInfrastructureConfig.class);
        this.rewardNetwork = context.getBean(RewardNetwork.class);;
    }

    @Test
    void testRewardForDining() {
        
    }
    
}
