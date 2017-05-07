package cn.hellyuestc.caiyuan.entity;

import java.util.Date;
import java.util.List;

public class Question {
	
	private long id;
	private long userId;
	private long topicId;
	private String title;
	private String content;
	private int scanCount;
	private int answerCount;
	private Date gmtCreate;
	private Date gmtModified;
	
	private User user;
	private Topic topic;
	private List<QuestionImage> imageList;
	
}