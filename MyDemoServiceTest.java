package com.example.demolistinitialization.service;

import java.util.List;

import com.example.demolistinitialization.component.ComplexComponent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyDemoServiceTest {

    @Mock
    private ComplexComponent component;

    @Spy
    private List<ComplexComponent> complexComponentList;

    @InjectMocks
    private MyDemoService myDemoService;

    @Test
    void testProcessMap() {
        myDemoService.processMap();
    }
}