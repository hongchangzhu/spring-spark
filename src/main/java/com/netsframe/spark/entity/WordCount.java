package com.netsframe.spark.entity;

import scala.Serializable;

public class WordCount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8963982435697131851L;
	private String word;
	private Integer count;

	public WordCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WordCount(String word, Integer count) {
		super();
		this.word = word;
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
