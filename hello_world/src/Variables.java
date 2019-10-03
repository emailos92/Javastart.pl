public class Variables {
    public static void main(String[] args) {
        String imieWlasciciela = "Aga";
        int wiekWlasciciela = 20;
        int wiekKota = 2;
        int wiekPsa = 15;
        final String pesel = "012345678910";

        System.out.println(imieWlasciciela + " ma kota");
        System.out.println(imieWlasciciela + " ma psa");
        System.out.println("Kot ma " + 2 + " lata a Aga " + wiekWlasciciela);
        System.out.println("Pies ma " + wiekPsa + "lat ale to " + wiekPsa/3 + " lat ludzkich");
        System.out.println("Rok ludzki to " + wiekPsa/5 + " lata psie");
    }
}
