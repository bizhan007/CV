package kz.sg.service;

import kz.sg.model.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getProjects();
    List<Project> getProjectById(Integer id);
}
