package ie.atu.paymenthotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PaymentHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHotelApplication.class, args);
    }

}
