package com.penroz.springboot.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.penroz.springboot.graphql.data.LinkRepository;
import com.penroz.springboot.graphql.data.model.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LinkMutator implements GraphQLMutationResolver {

    @Autowired
    private LinkRepository linkRepository;

    public Link linkCreate(String url, String description) {
        Link link = new Link(url, description);
        linkRepository.save(link);
        return link;
    }
}
