package Controller;

import Model.Plate;
import Service.PlateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

public class PlateController {
    /*
    What do I want out of a service class?
    A service class is for business logic.
    I want to have as much separation of concerns as possible:
    So..
    I want my DAO to be responsible for only interaction with persistent information
    I want my controller to be responsible only for web responses
    Any logic that is exclusive to Java should be done elsewhere..
    which is why I want a service class
     */
    Javalin app;
    PlateService service;
    public PlateController(){

    }
    public void start(){
        Javalin app = Javalin.create();
        PlateService service = new PlateService();
        app.start(5000);

        app.get("/plates/{id}", context -> {
            int plateID = Integer.parseInt(context.pathParam("id"));
            context.json(service.getPlate(plateID));
        });
        app.post("/plates", context -> {
            ObjectMapper mapper = new ObjectMapper();
            Plate plate = mapper.readValue(context.body(), Plate.class);
            service.add(plate);
        });
    }
}
