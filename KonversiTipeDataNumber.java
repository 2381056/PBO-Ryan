public class KonversiTipeDataNumber {
    public static void main(String[] args){
        //widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        //narrowing
        int tipeDataInteger = -129;
        byte tipeDataByte2 = (byte) tipeDataInteger;
        System.out.println(tipeDataByte2);
        String firstName, lastName;
        firstName = "Asaryant";
        lastName = "Talarima";

        System.out.printf("%s %s, firstName, lastName");
    }
}
