package com;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class HelloWorldService extends Service<HelloWorldServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(Bootstrap<HelloWorldServiceConfiguration> bootstrap) {
        bootstrap.setName("Hello World Dropwizard");
    }

    @Override
    public void run(HelloWorldServiceConfiguration conf, Environment env) throws Exception {
        env.addResource(new HelloWorldResource(conf.getMessage()));
    }
}
