
package com.services;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InterruptedException", targetNamespace = "http://services.com/")
public class InterruptedException_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InterruptedException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InterruptedException_Exception(String message, InterruptedException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InterruptedException_Exception(String message, InterruptedException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.services.InterruptedException
     */
    public InterruptedException getFaultInfo() {
        return faultInfo;
    }

}
