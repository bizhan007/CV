package kz.sg.service;

import kz.sg.model.Project;
import kz.sg.model.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> getResumes();
    List<Resume> getResumeById(Integer id);
}
