package article.example.board.common;

public class ArticleVO {
    private String TITLE;
    private String CONTENTS;

    public ArticleVO() { }

    public ArticleVO(String TITLE, String CONTENTS) {
        this.TITLE = TITLE;
        this.CONTENTS = CONTENTS;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getCONTENTS() {
        return CONTENTS;
    }

    public void setCONTENTS(String CONTENTS) {
        this.CONTENTS = CONTENTS;
    }
}
