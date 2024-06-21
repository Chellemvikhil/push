package com.sapient.app;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

//The following is for Junit 4
//@RunWith(MockitoJUnitRunner.class)
//The following for Junit 5
/*
 * @ExtendWith is a repeatable annotation that is
 * used to register extensions for the annotated
 * test class or test method.(Mockito library is an
 * extension to Junit 5)
 */
@ExtendWith(MockitoExtension.class)
public class MockHashMap{
    @Mock
    private HashMap<String, Integer> mockHashMap;

    @Test
    public void saveTest(){
        mockHashMap.put("A", 1);
        mockHashMap.get("A");

        Mockito.verify(mockHashMap,times(1)).put("A", 1);
        Mockito.verify(mockHashMap,times(1)).get("A");
        //The @Mock doesnt create instance of HashMap but creates proxy/dummy HashMap instance
//        assertEquals(1, mockHashMap.size());
        assertEquals(0, mockHashMap.size());
    }

}
