package com.rahul.ppmtool.services;

import com.rahul.ppmtool.domain.Project;
import com.rahul.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    //Saving project object into DB
    public Project saveOrUpdate(Project project){
        //Logic
        return projectRepository.save(project);
    }

}
