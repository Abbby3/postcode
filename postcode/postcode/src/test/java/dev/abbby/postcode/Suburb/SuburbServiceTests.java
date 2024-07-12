package dev.abbby.postcode.Suburb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class SuburbServiceTests {
    @Autowired
    private SuburbService suburbService;

    @MockBean
    private SuburbRepository suburbRepository;

    @Test
    public void testGetSuburbByPostcode() {
        String postcode = "1234";
        Suburb suburb = new Suburb();
        suburb.setPostcode(postcode);

        Mockito.when(suburbRepository.findByPostcode(postcode)).thenReturn(Optional.of(suburb));

        Optional<Suburb> found = suburbService.getSuburbByPostcode(postcode);
        assertTrue(found.isPresent());
        assertEquals(postcode, found.get().getPostcode());
    }
}
