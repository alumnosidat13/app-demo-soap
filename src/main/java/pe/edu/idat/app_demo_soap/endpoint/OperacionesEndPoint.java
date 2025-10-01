package pe.edu.idat.app_demo_soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.app_demo_soap.service.OperacionesService;
import pe.edu.idat.ws.operaciones.*;

@Endpoint
public class OperacionesEndPoint {

    private final OperacionesService operacionesService;
    private static final String URI_NAMESPACE = "http://www.idat.edu.pe/ws/operaciones";

    public OperacionesEndPoint(
            OperacionesService operacionesService) {
        this.operacionesService = operacionesService;
    }

    @PayloadRoot(namespace = URI_NAMESPACE,
    localPart = "getSumaRequest")
    @ResponsePayload
    public GetSumaResponse getSuma(@RequestPayload
                                   GetSumaRequest request){
        GetSumaResponse response = new GetSumaResponse();
        response.setResultado(
                operacionesService.suma(request.getNum1(),
                        request.getNum2()));
        return response;
    }

    @PayloadRoot(namespace = URI_NAMESPACE,
            localPart = "getRestaRequest")
    @ResponsePayload
    public GetRestaResponse getResta(@RequestPayload
                                    GetRestaRequest request){
        GetRestaResponse response = new GetRestaResponse();
        response.setResultado(
                operacionesService.resta(request.getNum1(),
                        request.getNum2()));
        return response;
    }

    @PayloadRoot(namespace = URI_NAMESPACE,
            localPart = "getMultiplicaRequest")
    @ResponsePayload
    public GetMultiplicaResponse getMultiplica(@RequestPayload
                                     GetMultiplicaRequest request){
        GetMultiplicaResponse response = new GetMultiplicaResponse();
        response.setResultado(
                operacionesService.multiplica(request.getNum1(),
                        request.getNum2()));
        return response;
    }


    @PayloadRoot(namespace = URI_NAMESPACE,
            localPart = "getDivideRequest")
    @ResponsePayload
    public GetDivideResponse getDivide(@RequestPayload
                                     GetDivideRequest request){
        GetDivideResponse response = new GetDivideResponse();
        response.setResultado(
                operacionesService.divide(request.getNum1(),
                        request.getNum2()));
        return response;
    }


}
