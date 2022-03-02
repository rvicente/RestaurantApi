package pt.capgemini.allanborges.restaurantapi.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pt.capgemini.allanborges.restaurantapi.entity.ResponseMenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@ControllerAdvice
public class RestMenuExceptionHandler {

    @ExceptionHandler(MenuNotFoundException.class)
    public ResponseEntity<ResponseMenu> menuNotFoundException(){
        ResponseMenu responseMenu = new ResponseMenu("NOK", new Date().toString(), "500", UUID.randomUUID().toString(), "Exception Menu getById Success", new ArrayList<>());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseMenu);
    }

    @ExceptionHandler(MenuFieldNotAddedException.class)
    public ResponseEntity<ResponseMenu> menuFieldNotAddedException(){
        ResponseMenu responseMenu = new ResponseMenu("NOK", new Date().toString(), "500", UUID.randomUUID().toString(), "Exception Menu addMenu Success", new ArrayList<>());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseMenu);
    }

}
