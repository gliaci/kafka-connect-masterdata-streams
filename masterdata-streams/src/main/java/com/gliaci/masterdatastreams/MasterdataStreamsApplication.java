package com.gliaci.masterdatastreams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MasterdataStreamsJsonConfiguration.class)
public class MasterdataStreamsApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(MasterdataStreamsApplication.class, args);
  }

}
