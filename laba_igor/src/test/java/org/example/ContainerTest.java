package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerTest {
    @Test
    void container_empty_if_not_data_added() {
        Container container = new Container();
        assertTrue(container.is_empty());
    }

    @Test
    void container_not_empty_if_data_added_using_constructor() {
        Container container = new Container(1, 2, 3, 4, 5);
        assertFalse(container.is_empty());
    }

    @Test
    void container_not_empty_if_data_added_using_add_method() {
        Container container = new Container(1);
        assertFalse(container.is_empty());
    }

    @Test
    void remove_method_returns_false_if_not_delete_value() {
        Container container = new Container(2);
        assertFalse(container.remove(1));
    }

    @Test
    void remove_method_returns_false_if_container_is_empty() {
        Container container = new Container();
        assertFalse(container.remove(1));
    }

    @Test
    void remove_method_returns_true_if_value_deleted() {
        Container container = new Container(1);
        assertTrue(container.remove(1));
    }

    @Test
    void get_method_returns_null_if_value_is_not_found() {
        Container container = new Container(1, 2, 3, 4, 5);
        assertNull(container.get(6));

    }

    @Test
    void get_method_returns_value_if_value_is_found() {
        Container container = new Container(1, 2, 3, 4, 5);
        assertEquals(container.get(3).item, 3);
    }
}
