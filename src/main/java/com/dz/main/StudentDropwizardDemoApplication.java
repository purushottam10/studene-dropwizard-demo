package com.dz.main;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class StudentDropwizardDemoApplication extends Application<StudentDropwizardDemoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new StudentDropwizardDemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "student-dropwizard-demo";
    }

    @Override
    public void initialize(final Bootstrap<StudentDropwizardDemoConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final StudentDropwizardDemoConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
