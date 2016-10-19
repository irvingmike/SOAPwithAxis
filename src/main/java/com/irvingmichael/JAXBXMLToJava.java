package com.irvingmichael;

import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Created by Aaron Anderson on 10/19/16.
 */
public class JAXBXMLToJava {

    private final Logger log = Logger.getLogger(this.getClass());

    public DwmlType buildDwmlTypeFromXML(String xmlText) {

        DwmlType dwml = new DwmlType();

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            StringReader reader = new StringReader(xmlText);

            dwml = (DwmlType) jaxbUnmarshaller.unmarshal(reader);

        } catch (JAXBException e) {
            log.error("Marshalling error: " + e);
        }

        return dwml;
    }
}
