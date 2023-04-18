package ru.netology.jdbc_hw_latest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.jdbc_hw_latest.repository.RepositoryOrdersImpl;

import java.util.List;
@Service
@RequiredArgsConstructor

public class ServiceOrdersImps implements ServiceOrders{
    private final RepositoryOrdersImpl repositoryOrders;

    @Override
    public List<String> getProductName(String name) {
        return repositoryOrders.getProductName(name);
    }
}
