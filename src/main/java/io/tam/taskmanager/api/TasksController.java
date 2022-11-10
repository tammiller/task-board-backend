package io.tam.taskmanager.api;

import io.tam.taskmanager.service.TasksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class TasksController implements TasksApi {

    TasksService service;
}
