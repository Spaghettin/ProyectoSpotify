
package com.servicios;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "UsuarioRepetidoException", targetNamespace = "http://servicios.com/")
public class UsuarioRepetidoException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UsuarioRepetidoException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UsuarioRepetidoException_Exception(String message, UsuarioRepetidoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UsuarioRepetidoException_Exception(String message, UsuarioRepetidoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.servicios.UsuarioRepetidoException
     */
    public UsuarioRepetidoException getFaultInfo() {
        return faultInfo;
    }

}
