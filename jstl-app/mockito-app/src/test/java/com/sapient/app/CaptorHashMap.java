package com.sapient.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CaptorHashMap{
    @Mock
    private HashMap<String, Integer> hashMap;
    @Captor
    private ArgumentCaptor<String> keyCaptor;
    @Captor
    private ArgumentCaptor<Integer> valueCaptor;

    @Test
    public void saveTest() {
        hashMap.put("A", 10);

        Mockito.verify(hashMap).put(keyCaptor.capture(), valueCaptor.capture());

        assertEquals("A", keyCaptor.getValue());
        assertEquals(10,  valueCaptor.getValue());
    }

}