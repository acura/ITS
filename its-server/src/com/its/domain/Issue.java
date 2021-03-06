package com.its.domain;

import java.util.Date;

public class Issue 
{
	private Integer oid;
	private String developer;
	private String issueNo;
	private String project;
    private Date  issueDate;
    private Double hours;
    private String comment;
    private String activity;
    private Date   createdDate;
    private Date   lastUpdatedDate;
    
	
	public Date getCreatedDate() 
	{
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) 
	{
		this.createdDate = createdDate;
	}
	public Date getLastUpdatedDate() 
	{
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) 
	{
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public Integer getOid() 
	{
		return oid;
	}
	public void setOid(Integer oid) 
	{
		this.oid = oid;
	}
	public String getDeveloper() 
	{
		return developer;
	}
	public void setDeveloper(String developer) 
	{
		this.developer = developer;
	}
	
	public Date getIssueDate() 
	{
		return issueDate;
	}
	public void setIssueDate(Date issueDate) 
	{
		this.issueDate = issueDate;
	}
	public double getHours() 
	{
		return hours;
	}
	public void setHours(Double hours) 
	{
		this.hours = hours;
	}
	public String getIssueNo() 
	{
		return issueNo;
	}
	public void setIssueNo(String issueNo) 
	{
		this.issueNo = issueNo;
	}
	public String getProject() 
	{
		return project;
	}
	public void setProject(String project)
	{
		this.project = project;
	}
	
	public String getComment() 
	{
		return comment;
	}
	public void setComment(String comment) 
	{
		this.comment = comment;
	}
	public String getActivity() 
	{
		return activity;
	}
	public void setActivity(String activity) 
	{
		this.activity = activity;
	}
	
	
}

