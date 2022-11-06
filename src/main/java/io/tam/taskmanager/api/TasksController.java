package io.tam.taskmanager.api;

import io.tam.taskmanager.service.TasksService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TasksController implements TasksApi {

    TasksService service;
}
