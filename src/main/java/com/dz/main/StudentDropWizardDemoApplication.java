package com.dz.main;

import com.dz.main.resources.StudentController;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class StudentDropWizardDemoApplication extends Application<StudentDropwizardDemoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new StudentDropWizardDemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "student-DropWizard-demo";
    }

    @Override
    public void initialize(final Bootstrap<StudentDropwizardDemoConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final StudentDropwizardDemoConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        final StudentController resource = new StudentController(configuration.getDefaultName()
                , configuration.getTemplate());
       environment.jersey().register(resource);
    }
}
