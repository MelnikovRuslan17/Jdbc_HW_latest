package ru.netology.jdbc_hw_latest.repository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.apache.tomcat.jni.File.read;


@Repository
@RequiredArgsConstructor
public class RepositoryOrdersImpl implements RepositoryOrders{
    private static final String scriptFileName = "join_table.sql";
    private  final NamedParameterJdbcTemplate parameterJdbcTemplate;
    @Override
    public List<String> getProductName(String name) {
        return parameterJdbcTemplate.queryForList(read(), Map.of("name", name),String.class);
    }
    private static String read() {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
