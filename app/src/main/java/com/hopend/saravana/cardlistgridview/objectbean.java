package com.hopend.saravana.cardlistgridview;

public class objectbean {
     private String title;
     private String duration;
     private String singer;
     private String filename;
    private String uri;
     
	public String getFilename() {
        return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}