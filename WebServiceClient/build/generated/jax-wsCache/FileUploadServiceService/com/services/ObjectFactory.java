
package com.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://services.com/", "Exception");
    private final static QName _InterruptedException_QNAME = new QName("http://services.com/", "InterruptedException");
    private final static QName _FileSizeAndFile_QNAME = new QName("http://services.com/", "fileSizeAndFile");
    private final static QName _FileSizeAndFileResponse_QNAME = new QName("http://services.com/", "fileSizeAndFileResponse");
    private final static QName _WaitFor10Sec_QNAME = new QName("http://services.com/", "waitFor10Sec");
    private final static QName _WaitFor10SecResponse_QNAME = new QName("http://services.com/", "waitFor10SecResponse");
    private final static QName _FileSizeAndFileData_QNAME = new QName("", "data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link InterruptedException }
     * 
     */
    public InterruptedException createInterruptedException() {
        return new InterruptedException();
    }

    /**
     * Create an instance of {@link FileSizeAndFile }
     * 
     */
    public FileSizeAndFile createFileSizeAndFile() {
        return new FileSizeAndFile();
    }

    /**
     * Create an instance of {@link FileSizeAndFileResponse }
     * 
     */
    public FileSizeAndFileResponse createFileSizeAndFileResponse() {
        return new FileSizeAndFileResponse();
    }

    /**
     * Create an instance of {@link WaitFor10Sec }
     * 
     */
    public WaitFor10Sec createWaitFor10Sec() {
        return new WaitFor10Sec();
    }

    /**
     * Create an instance of {@link WaitFor10SecResponse }
     * 
     */
    public WaitFor10SecResponse createWaitFor10SecResponse() {
        return new WaitFor10SecResponse();
    }

    /**
     * Create an instance of {@link FileUploadResponseDTO }
     * 
     */
    public FileUploadResponseDTO createFileUploadResponseDTO() {
        return new FileUploadResponseDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InterruptedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "InterruptedException")
    public JAXBElement<InterruptedException> createInterruptedException(InterruptedException value) {
        return new JAXBElement<InterruptedException>(_InterruptedException_QNAME, InterruptedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSizeAndFile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSizeAndFile }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "fileSizeAndFile")
    public JAXBElement<FileSizeAndFile> createFileSizeAndFile(FileSizeAndFile value) {
        return new JAXBElement<FileSizeAndFile>(_FileSizeAndFile_QNAME, FileSizeAndFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSizeAndFileResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSizeAndFileResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "fileSizeAndFileResponse")
    public JAXBElement<FileSizeAndFileResponse> createFileSizeAndFileResponse(FileSizeAndFileResponse value) {
        return new JAXBElement<FileSizeAndFileResponse>(_FileSizeAndFileResponse_QNAME, FileSizeAndFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaitFor10Sec }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaitFor10Sec }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "waitFor10Sec")
    public JAXBElement<WaitFor10Sec> createWaitFor10Sec(WaitFor10Sec value) {
        return new JAXBElement<WaitFor10Sec>(_WaitFor10Sec_QNAME, WaitFor10Sec.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaitFor10SecResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaitFor10SecResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.com/", name = "waitFor10SecResponse")
    public JAXBElement<WaitFor10SecResponse> createWaitFor10SecResponse(WaitFor10SecResponse value) {
        return new JAXBElement<WaitFor10SecResponse>(_WaitFor10SecResponse_QNAME, WaitFor10SecResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "data", scope = FileSizeAndFile.class)
    public JAXBElement<byte[]> createFileSizeAndFileData(byte[] value) {
        return new JAXBElement<byte[]>(_FileSizeAndFileData_QNAME, byte[].class, FileSizeAndFile.class, ((byte[]) value));
    }

}
