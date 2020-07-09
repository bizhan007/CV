package kz.sg.repository;

import jdk.dynalink.linker.LinkerServices;
import kz.sg.model.Project;
import kz.sg.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeRepository extends JpaRepository<Resume,Integer> {
    List<Resume> getResumeById(Integer id);
}
