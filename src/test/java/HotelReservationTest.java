import com.hotelreservationsystem.HotelReservation;
import com.hotelreservationsystem.Hotels;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void when_Added_a_new_Hotel_should_returnTrue() {
        HotelReservation hotel1 = new HotelReservation();
        Hotels hotelone = new Hotels("BridgeWood", 160);
        Hotels hoteltwo = new Hotels("Lakewood", 110);
        Hotels hotelthree = new Hotels("Ridgewood", 220);
        boolean hotelonecheck = hotel1.add(hotelone);
        Assertions.assertEquals(hotelonecheck, true);
        boolean hoteltwocheck = hotel1.add(hoteltwo);
        Assertions.assertEquals(hoteltwocheck, true);
        boolean hotelthreecheck = hotel1.add(hotelthree);
        Assertions.assertEquals(hotelthreecheck, true);
    }
}
