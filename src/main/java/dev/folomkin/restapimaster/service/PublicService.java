package dev.folomkin.restapimaster.service;

import dev.folomkin.restapimaster.controller.ServerTechnicalInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class PublicService {

    @Value("${server.port}")
    private String server_port;

    public ServerTechnicalInfo getServerTechnicalInfo() {
        return new ServerTechnicalInfo(
                "Техническая информация о сервере: Проект: 'Rest Api Master', порт: " + server_port
        );
    }
}
