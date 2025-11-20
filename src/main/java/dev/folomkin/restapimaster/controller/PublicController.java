package dev.folomkin.restapimaster.controller;


import dev.folomkin.restapimaster.exception.ServiceException;
import dev.folomkin.restapimaster.service.PublicService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = "/api/v1/public",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class PublicController extends ControllerBase {

    private final PublicService publicService;

    public PublicController(PublicService publicService) {
        this.publicService = publicService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    public ServerTechnicalInfo getServerTechnicalInfo() throws ServiceException {
        return publicService.getServerTechnicalInfo();
    }
}

