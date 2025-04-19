package com.example.todo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToDoManagerTest {

    @Test
    public void testAddAndRemoveTask() {
        ToDoManager manager = new ToDoManager();
        manager.addTask("Buy groceries");
        assertEquals(1, manager.getTaskCount());
        assertTrue(manager.getTasks().contains("Buy groceries"));

        manager.removeTask("Buy groceries");
        assertEquals(0, manager.getTaskCount());
    }
}
