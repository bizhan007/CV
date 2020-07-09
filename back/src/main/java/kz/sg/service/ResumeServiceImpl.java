package kz.sg.service;

import kz.sg.model.Project;
import kz.sg.model.Resume;
import kz.sg.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService{

    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public List<Resume> getResumes() {
        return resumeRepository.findAll();
    }

    @Override
    public List<Resume> getResumeById(Integer id) {
        return resumeRepository.getResumeById(id);
    }
}
