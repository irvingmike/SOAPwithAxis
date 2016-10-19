package gov.weather;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aaron Anderson on 10/19/16.
 */
public class NdfdXMLBindingStubTest {
    @Test
    public void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub  binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53705");
        assertEquals("Result from Zip did not match expected results", "???", result);
    }

}