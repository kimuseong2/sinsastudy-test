package site.sinsauseong.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.SampleHotel;

import static junit.framework.TestCase.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/root-context.xml")
@Log4j
public class HotelTest {

    @Setter(onMethod = @_ ({@Autowired}))
    private SampleHotel hotel;

    @Test
    public void testExist() {

        log.info(hotel);
        log.info("------------");
        log.info(hotel.getChef());
    }

    //IllegalStateException 2022.03.04
}
