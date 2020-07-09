package kz.sg.service;

import kz.sg.model.Project;
import kz.sg.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public List<Project> getProjectById(Integer id) {
        return projectRepository.getProjectById(id);
    }
}
