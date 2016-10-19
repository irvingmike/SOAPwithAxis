package com.irvingmichael;

import gov.weather.NdfdXMLBindingStub;
import gov.weather.NdfdXMLLocator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aaron Anderson on 10/19/16.
 */
public class JAXBXMLToJavaTest {
    @Test
    public void buildDwmlTypeFromXML() throws Exception {

        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String result = binding.latLonListZipCode("53705");

        JAXBXMLToJava converter = new JAXBXMLToJava();
        DwmlType dwml = converter.buildDwmlTypeFromXML(result);

        assertEquals("Xml conversion did not work as expected", "43.0798,-89.3875", dwml.getLatLonList());

    }

}