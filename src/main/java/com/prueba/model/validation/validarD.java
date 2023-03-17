
package com.prueba.model.validation;

import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("vdatos")
public class validarD implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        
        String nDatos  = o.toString().trim();
        
        if(nDatos.length() == 0){
            throw new ValidatorException(new FacesMessage("Campo Obligatorio"));
        }
        else{
            
        }
    }
    
    
}
