package edu.mx.utleon.militarizedcollegesystem.staff;

import edu.mx.utleon.militarizedcollegesystem.common.entities.staff.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${microservices.url.staff}")
    private String STAFF_URL;

    public List<Area> getAllAreas() {
        String path = STAFF_URL + "areas";
        return restTemplate.getForObject(path, List.class);
    }

}
