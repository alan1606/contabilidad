
package clientews.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EquipoDicomServiceWs", targetNamespace = "http://servicio.sga.gm.com.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EquipoDicomServiceWs {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<clientews.servicio.EquipoDicom>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarEquipoDicomPorIdArea", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorIdArea")
    @ResponseWrapper(localName = "encontrarEquipoDicomPorIdAreaResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorIdAreaResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorIdAreaRequest", output = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorIdAreaResponse")
    public List<EquipoDicom> encontrarEquipoDicomPorIdArea(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns clientews.servicio.EquipoDicom
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarEquipoDicomPorNombre", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorNombre")
    @ResponseWrapper(localName = "encontrarEquipoDicomPorNombreResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorNombreResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorNombreRequest", output = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorNombreResponse")
    public EquipoDicom encontrarEquipoDicomPorNombre(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns clientews.servicio.EquipoDicom
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarEquipoDicomPorId", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorId")
    @ResponseWrapper(localName = "encontrarEquipoDicomPorIdResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorIdResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorIdRequest", output = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorIdResponse")
    public EquipoDicom encontrarEquipoDicomPorId(
        @WebParam(name = "arg0", targetNamespace = "")
        EquipoDicom arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<clientews.servicio.EquipoDicom>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarEquipoDicomPorArea", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorArea")
    @ResponseWrapper(localName = "encontrarEquipoDicomPorAreaResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorAreaResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorAreaRequest", output = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorAreaResponse")
    public List<EquipoDicom> encontrarEquipoDicomPorArea(
        @WebParam(name = "arg0", targetNamespace = "")
        Areas arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<clientews.servicio.EquipoDicom>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarEquipoDicomPorModalidad", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorModalidad")
    @ResponseWrapper(localName = "encontrarEquipoDicomPorModalidadResponse", targetNamespace = "http://servicio.sga.gm.com.mx/", className = "clientews.servicio.EncontrarEquipoDicomPorModalidadResponse")
    @Action(input = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorModalidadRequest", output = "http://servicio.sga.gm.com.mx/EquipoDicomServiceWs/encontrarEquipoDicomPorModalidadResponse")
    public List<EquipoDicom> encontrarEquipoDicomPorModalidad(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
