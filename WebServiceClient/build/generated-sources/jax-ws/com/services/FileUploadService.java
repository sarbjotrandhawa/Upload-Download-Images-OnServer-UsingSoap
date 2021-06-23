
package com.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FileUploadService", targetNamespace = "http://services.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FileUploadService {


    /**
     * 
     * @param fileName
     * @param data
     * @return
     *     returns com.services.FileUploadResponseDTO
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fileSizeAndFile", targetNamespace = "http://services.com/", className = "com.services.FileSizeAndFile")
    @ResponseWrapper(localName = "fileSizeAndFileResponse", targetNamespace = "http://services.com/", className = "com.services.FileSizeAndFileResponse")
    @Action(input = "http://services.com/FileUploadService/fileSizeAndFileRequest", output = "http://services.com/FileUploadService/fileSizeAndFileResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://services.com/FileUploadService/fileSizeAndFile/Fault/Exception")
    })
    public FileUploadResponseDTO fileSizeAndFile(
        @WebParam(name = "fileName", targetNamespace = "")
        String fileName,
        @WebParam(name = "data", targetNamespace = "")
        byte[] data)
        throws Exception_Exception
    ;

    /**
     * 
     * @throws InterruptedException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "waitFor10Sec", targetNamespace = "http://services.com/", className = "com.services.WaitFor10Sec")
    @ResponseWrapper(localName = "waitFor10SecResponse", targetNamespace = "http://services.com/", className = "com.services.WaitFor10SecResponse")
    @Action(input = "http://services.com/FileUploadService/waitFor10SecRequest", output = "http://services.com/FileUploadService/waitFor10SecResponse", fault = {
        @FaultAction(className = InterruptedException_Exception.class, value = "http://services.com/FileUploadService/waitFor10Sec/Fault/InterruptedException")
    })
    public void waitFor10Sec()
        throws InterruptedException_Exception
    ;

}
