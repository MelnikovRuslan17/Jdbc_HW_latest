package ru.netology.jdbc_hw_latest.cotroller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.jdbc_hw_latest.service.ServiceOrdersImps;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetController {
    private final ServiceOrdersImps serviceOrdersImps;
    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name")String name){
        return serviceOrdersImps.getProductName(name);
    }
}
