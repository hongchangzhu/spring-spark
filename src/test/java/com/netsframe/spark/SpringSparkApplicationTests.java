package com.netsframe.spark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.netsframe.spark.entity.WordCount;
import com.netsframe.spark.service.WordCountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSparkApplicationTests {
	private static Logger log = LoggerFactory.getLogger(SpringSparkApplicationTests.class);
	@Autowired
	WordCountService wordCountService;

	@Test
	public void testWordCount() {
		List<WordCount> list = this.wordCountService.doWordCount();
		List<Map<String, Integer>> result = new ArrayList<Map<String, Integer>>();
		for (WordCount wc : list) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put(wc.getWord(), wc.getCount());
			result.add(map);
		}
		log.info("result:" + result);
	}
}
