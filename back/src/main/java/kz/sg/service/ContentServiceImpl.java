package kz.sg.service;

import kz.sg.model.Content;
import kz.sg.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService{

    @Autowired
    private ContentRepository contentRepository;

    @Override
    public List getContents() {
        return contentRepository.findAll();
    }

    @Override
    public List<Content> getContentByID(Integer id) {
        return contentRepository.getContentById(id);
    }
}
