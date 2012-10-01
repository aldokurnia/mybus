/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjsu.mybus.model;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;


@MessageDriven(mappedName = "busdatacollector",
		activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/BusDataQueue") })
public class BusDataCollectorBean implements MessageListener {

    Logger logger = Logger.getLogger("test");

    public void onMessage(Message msg) {
        try {
            String name = msg.getStringProperty("name");
            logger.info("Received msg " + msg + ", from " + name);
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }
}