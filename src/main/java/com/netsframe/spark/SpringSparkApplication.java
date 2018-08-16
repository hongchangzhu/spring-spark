package com.netsframe.spark;


import org.apache.spark.mllib.linalg.Vector;
import org.apache.spark.mllib.linalg.Vectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSparkApplication.class, args);
		Vector vMale = Vectors.dense(1,0,1,0,1,0);
	}
}
