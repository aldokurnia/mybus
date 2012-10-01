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


@MessageDriven(mappedName = "jms/BusDataQueue",
		activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/BusDataQueue") })
public class BusDataCollectorBean implements MessageListener {

    Logger logger = Logger.getLogger("test");

    public void onMessage(Message msg) {
        try {
            System.out.println("Received msg: " + msg);
            logger.info("Received msg: " + msg);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}