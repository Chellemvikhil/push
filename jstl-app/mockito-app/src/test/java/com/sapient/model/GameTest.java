package com.sapient.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Mock
    private Player player;
    @InjectMocks
    private Game game;

    /*
    Use MockitoAnnotations.initMocks to initiate the @Mock and @InjectMocks objects.
     */
    @BeforeEach
    public void setup() {
        //initMocks() is deprecated
//        MockitoAnnotations.initMocks(this);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void attackWithSwordTest() throws Exception {
        Mockito.when(player.getWeapon()).thenReturn("Sword");

        assertEquals("Player attack with: Sword", game.attack());
    }
}