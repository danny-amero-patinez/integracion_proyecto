//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.13 a las 10:01:59 PM GMT-07:00 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _AfectacionPresupuestalResponse_QNAME = new QName("", "AfectacionPresupuestalResponse");
    private final static QName _PagoResponse_QNAME = new QName("", "PagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AfectacionPresupuestalRequest }
     * 
     */
    public AfectacionPresupuestalRequest createAfectacionPresupuestalRequest() {
        return new AfectacionPresupuestalRequest();
    }

    /**
     * Create an instance of {@link PagoRequest }
     * 
     */
    public PagoRequest createPagoRequest() {
        return new PagoRequest();
    }

    /**
     * Create an instance of {@link GuardadoRequest }
     * 
     */
    public GuardadoRequest createGuardadoRequest() {
        return new GuardadoRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AfectacionPresupuestalResponse")
    public JAXBElement<Boolean> createAfectacionPresupuestalResponse(Boolean value) {
        return new JAXBElement<Boolean>(_AfectacionPresupuestalResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PagoResponse")
    public JAXBElement<Boolean> createPagoResponse(Boolean value) {
        return new JAXBElement<Boolean>(_PagoResponse_QNAME, Boolean.class, null, value);
    }

}
