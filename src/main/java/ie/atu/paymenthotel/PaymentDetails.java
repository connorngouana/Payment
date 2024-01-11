package ie.atu.paymenthotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetails
{

    private double lengthOfStay;
    private double roomRate;
    private double taxRate;
    private double total;
}
