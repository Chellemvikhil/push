package com.sapient.app;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SpyHashMap{
    @Spy
    private HashMap<String, Integer> hashMap;

    @Test
    public void saveTest(){
        hashMap.put("A", 10);

        Mockito.verify(hashMap, times(1)).put("A", 10);
        Mockito.verify(hashMap, times(0)).get("A");
        //@Spy creates instance of HashMap
        assertEquals(1, hashMap.size());
        assertEquals(10, (Integer) hashMap.get("A"));
    }
}