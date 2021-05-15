package streamCoreJava;

public class News {
	 int newsID;
     String postbyUser;
     String commentbyUser;
     String comment;
	
    
	public News(int newsID, String postbyUser, String commentbyUser, String comment) {
		super();
		this.newsID = newsID;
		this.postbyUser = postbyUser;
		this.commentbyUser = commentbyUser;
		this.comment = comment;
	}

	public int getNewsID() {
		return newsID;
	}


	public void setNewsID(int newsID) {
		this.newsID = newsID;
	}


	public String getPostbyUser() {
		return postbyUser;
	}

	public void setPostbyUser(String postbyUser) {
		this.postbyUser = postbyUser;
	}

	public String getCommentbyUser() {
		return commentbyUser;
	}

	public void setCommentbyUser(String commentbyUser) {
		this.commentbyUser = commentbyUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsID=" + newsID + ", postbyUser=" + postbyUser + ", commentbyUser="
				+ commentbyUser + ", comment=" + comment + "]";
	}
	
}
