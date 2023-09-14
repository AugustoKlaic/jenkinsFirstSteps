package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WriterTest {

    private Writer writer;

    @BeforeEach
    public void setup(){
        writer = new Writer();
    }

    @Test
    public void shouldWriteMessage(){
        assertEquals(writer.writeMessage("Hello World!"), "Hello World! This is a test using Jenkins!");
    }

}