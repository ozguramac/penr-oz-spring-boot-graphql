package com.penroz.springboot.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.penroz.springboot.graphql.data.LinkRepository;
import com.penroz.springboot.graphql.data.model.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LinkQuery implements GraphQLQueryResolver {

    @Autowired
    private LinkRepository linkRepository;

    public List<Link> allLinks() {
        return linkRepository.findAll();
    }
}
