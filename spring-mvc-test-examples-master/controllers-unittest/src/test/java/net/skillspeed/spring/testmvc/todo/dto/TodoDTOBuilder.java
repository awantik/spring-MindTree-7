package net.skillspeed.spring.testmvc.todo.dto;

import net.skillspeed.spring.testmvc.todo.dto.TodoDTO;

/**
 * @author Awantik Das
 */
public class TodoDTOBuilder {

    private TodoDTO dto;

    public TodoDTOBuilder() {
        dto = new TodoDTO();
    }

    public TodoDTOBuilder id(Long id) {
        dto.setId(id);
        return this;
    }

    public TodoDTOBuilder description(String description) {
        dto.setDescription(description);
        return this;
    }

    public TodoDTOBuilder title(String title) {
        dto.setTitle(title);
        return this;
    }

    public TodoDTO build() {
        return dto;
    }
}
