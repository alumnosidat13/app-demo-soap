package pe.edu.idat.app_demo_soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.app_demo_soap.service.OperacionesService;
import pe.edu.idat.ws.operaciones.*;
import pe.edu.idat.ws.promedio.GetPromedioRequest;
import pe.edu.idat.ws.promedio.GetPromedioResponse;

@Endpoint
public class PromedioEndPoint {

    private final OperacionesService operacionesService;
    private static final String URI_NAMESPACE = "http://www.idat.edu.pe/ws/promedio";

    public PromedioEndPoint(
            OperacionesService operacionesService) {
        this.operacionesService = operacionesService;
    }

    @PayloadRoot(namespace = URI_NAMESPACE,
    localPart = "getPromedioRequest")
    @ResponsePayload
    public GetPromedioResponse getPromedio(@RequestPayload
                                       GetPromedioRequest request){
        GetPromedioResponse response = new GetPromedioResponse();

        return response;
    }




}
