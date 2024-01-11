package ie.atu.paymenthotel;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
public class PaymentController
{
    @PostMapping("/payment-confirm")
    public String Payment(@RequestBody PaymentDetails paymentDetails) {
        System.out.println("Welcome to Connor's Sanctuary");
        double roomRates = paymentDetails.getRoomRate();
        double taxRates = paymentDetails.getTaxRate();
        double lengthOfStay = paymentDetails.getLengthOfStay();

        if (lengthOfStay > 0 && lengthOfStay <= 30)
        {
            double total = 0;
            for (int nightsStaying = 1; nightsStaying <= lengthOfStay; nightsStaying++)
            {
                double roomTax = roomRates * (taxRates * nightsStaying);
                total += (roomTax + roomRates);
            }
            return "Your total is " + total;

        }
        else {
            return "You can only stay at my hotel for 30 days";
        }
    }


}
