package com.springbootquickstart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootquickstart.model.Topic;
import com.springbootquickstart.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value="/topics")
	private List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping(value="/topic/{id}")
	private Topic getAllTopic(@PathVariable int id) {
		return null;
	}
	
	@RequestMapping(value="/topics", method=RequestMethod.POST, consumes="application/json")
	private void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
	private void updateTopic(@PathVariable int id, @RequestBody Topic topic) {
		
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
	private void deleteTopic(@PathVariable int id) {
		
	}

}
