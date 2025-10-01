package pe.edu.idat.app_demo_soap.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionesService {

    public String suma(int num1, int num2){
        return "La suma es: " + (num1 + num2);
    }
    public String resta(int num1, int num2){
        return "La resta es: " + (num1 - num2);
    }
    public String multiplica(int num1, int num2){
        return "La multiplica es: " + (num1 * num2);
    }
    public String divide(int num1, int num2){
        if(num2 <= 0)
            return "No se puede dividir entre 0";
        return "La divide es: " + (num1 / num2);
    }
}
