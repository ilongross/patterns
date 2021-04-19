package jav.observer_pattern.bank_advertise;

public class TestSending {
    public static void main(String[] args) {
        HomeCreditBank hcfb = new HomeCreditBank();
        Client m1 = new Male1(hcfb);
        Client m2 = new Male1(hcfb);
        Client f1 = new Male1(hcfb);
        Client f2 = new Male1(hcfb);

        hcfb.addCreditAds(  "New small credit rates",
                            "New installment payment");
        System.out.println();


        hcfb.removeCreditAds("New small credit rates");
        System.out.println();



        hcfb.addCreditAds(  "New long-term credits",
                            "New mortgage credit for big family",
                            "New credit vacancy for our good clients");
    }
}
