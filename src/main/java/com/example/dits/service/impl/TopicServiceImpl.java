package com.example.dits.service.impl;

import com.example.dits.DAO.TopicRepository;
import com.example.dits.entity.Role;
import com.example.dits.entity.Topic;
import com.example.dits.service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TopicServiceImpl implements TopicService {

    private final TopicRepository repository;

    @Transactional
    public void create(Topic topic) {
        repository.save(topic);
    }

    @Transactional
    public void update(Topic topic, int id) {
        Optional<Topic> t = repository.findById(id);
        if(t.isEmpty())
            return;
        else
            repository.save(topic);
    }

    @Transactional
    public void delete(Topic topic) {
        repository.delete(topic);
    }

    @Transactional
    public void save(Topic topic) {
        repository.save(topic);
    }

    @Transactional
    public List<Topic> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Topic getTopicByName(String name) {
        return repository.getTopicByName(name);
    }
}
