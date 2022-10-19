package com.henryynolasco.notes.notetaking;

public class Note {
	private int id;
	private String description;
	private String text;
	private String datecreation;
	private String estimateCompletion;
	private String completion;
	private String link;
	private String mentions;
	private int priority;
	
	public Note(int id, String description, String text, String datecreation, String estimateCompletion,
			String completion, String link, String mentions, int priority) {
		super();
		this.id = id;
		this.description = description;
		this.text = text;
		this.datecreation = datecreation;
		this.estimateCompletion = estimateCompletion;
		this.completion = completion;
		this.link = link;
		this.mentions = mentions;
		this.priority = priority;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(String datecreation) {
		this.datecreation = datecreation;
	}
	public String getEstimateCompletion() {
		return estimateCompletion;
	}
	public void setEstimateCompletion(String estimateCompletion) {
		this.estimateCompletion = estimateCompletion;
	}
	public String getCompletion() {
		return completion;
	}
	public void setCompletion(String completion) {
		this.completion = completion;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getMentions() {
		return mentions;
	}
	public void setMentions(String mentions) {
		this.mentions = mentions;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Note [id=" + id + ", description=" + description + ", text=" + text + ", datecreation=" + datecreation
				+ ", estimateCompletion=" + estimateCompletion + ", completion=" + completion + ", link=" + link
				+ ", mentions=" + mentions + ", priority=" + priority + "]";
	}
	
}
