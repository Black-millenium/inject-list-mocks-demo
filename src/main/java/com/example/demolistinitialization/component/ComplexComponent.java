package com.example.demolistinitialization.component;

import java.util.Random;
import java.util.UUID;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ComplexComponent {

    private final String uuid = UUID.randomUUID().toString();
    private final Integer value = new Random().nextInt() * 15;

}
