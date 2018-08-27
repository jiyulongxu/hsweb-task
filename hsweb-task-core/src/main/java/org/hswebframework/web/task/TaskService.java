package org.hswebframework.web.task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task findById(String taskId);

    Task findByKey(String key);

    long total();

    Task createTask(String jobId);

    Task createTask(JobDetail jobDetail);

}
