package com.example.demolistinitialization.service;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.demolistinitialization.component.ComplexComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyDemoService {

    private final Map<String, ComplexComponent> mapToInject;

    public MyDemoService(List<ComplexComponent> components) {
        this.mapToInject = components.stream()
            .collect(Collectors.toMap(
                ComplexComponent::getUuid,
                Function.identity()
            ));
    }

    public void processMap() {
        log.info("{}", mapToInject);
    }
}
