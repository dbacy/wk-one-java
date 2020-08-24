public class Switch {

    public static float priceOfShipping (float orderValue, boolean saturdayDelivery, String destination) {
        float deliveryCost = 0;
        switch (destination) {
            case "US":deliveryCost = 20.00f; if (orderValue > 100) {
                deliveryCost -= 5.00f;
            }
            if (saturdayDelivery) {
                deliveryCost += 10.00f;
                break;
            }
            case "Mexico": deliveryCost = 32.00f;if (orderValue > 100) {
                deliveryCost -= 7.00f;
            }
                if (saturdayDelivery) {
                    deliveryCost += 20.00f;
                }        break;
            default: deliveryCost = 25.00f; if (orderValue > 100) {
                deliveryCost -= 7.00f;
            }
                if (saturdayDelivery) {
                    deliveryCost += 12.00f;
                }        break;
        }
        return deliveryCost;
    }

    public static void main(String[] args) {
        System.out.println( priceOfShipping(200, true, "canada"));
        System.out.println(priceOfShipping(100,false,"Mexico"));
        System.out.println(priceOfShipping(50,true,"US"));
        System.out.println(priceOfShipping(600,false,"US"));
        System.out.println(priceOfShipping(100,false,"Canada"));


    }


}