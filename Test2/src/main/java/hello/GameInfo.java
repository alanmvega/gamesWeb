package hello;


public class GameInfo {
	
	private final int MAX_SHORT_CONTENT = 150;

    private long id;
    private String name;
    private String content;
    private String shortContent;
    private String imgUrl;
    
    public GameInfo() {
	}

    public long getId() {
        return id;
    }

    public String getName() {
		return name;
	}

	public String getContent() {
        return content;
    }
	
	public String getShortContent() {
		this.shortContent = this.content.substring(0, Math.min(this.content.length(), MAX_SHORT_CONTENT)) + "...";
		return this.shortContent;
	}
    
    public String getImgUrl() {
    	return imgUrl;
    }

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}