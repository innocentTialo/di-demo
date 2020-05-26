package com.ddf.mainteam;

import com.ddf.mainteam.controllers.ConstructorInjectedController;
import com.ddf.mainteam.controllers.MyController;
import com.ddf.mainteam.controllers.PropertyInjectedController;
import com.ddf.mainteam.controllers.SetterInjectedController;
import com.ddf.mainteam.examplebeans.FakeDataSource;
import com.ddf.mainteam.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());
    }

}
