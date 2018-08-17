package com.javasm.book.model;

public class Book {
    private Long bid;

    private Long bookId;

    private String bookName;

    private String authorName;

    private Byte attribution;

    private Integer ftypeId;

    private Integer stypeId;

    private Integer status;

    private Boolean isVip;

    private String description;

    private String coverUrl;

    private String keyword;

    private String wordCount;

    private Integer lastUpdateChapterId;

    private String lastUpdateChapterName;

    private Boolean isrecommand;

    private Long bookpartner;

    private Integer readCount;

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public Byte getAttribution() {
        return attribution;
    }

    public void setAttribution(Byte attribution) {
        this.attribution = attribution;
    }

    public Integer getFtypeId() {
        return ftypeId;
    }

    public void setFtypeId(Integer ftypeId) {
        this.ftypeId = ftypeId;
    }

    public Integer getStypeId() {
        return stypeId;
    }

    public void setStypeId(Integer stypeId) {
        this.stypeId = stypeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(Boolean isVip) {
        this.isVip = isVip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount == null ? null : wordCount.trim();
    }

    public Integer getLastUpdateChapterId() {
        return lastUpdateChapterId;
    }

    public void setLastUpdateChapterId(Integer lastUpdateChapterId) {
        this.lastUpdateChapterId = lastUpdateChapterId;
    }

    public String getLastUpdateChapterName() {
        return lastUpdateChapterName;
    }

    public void setLastUpdateChapterName(String lastUpdateChapterName) {
        this.lastUpdateChapterName = lastUpdateChapterName == null ? null : lastUpdateChapterName.trim();
    }

    public Boolean getIsrecommand() {
        return isrecommand;
    }

    public void setIsrecommand(Boolean isrecommand) {
        this.isrecommand = isrecommand;
    }

    public Long getBookpartner() {
        return bookpartner;
    }

    public void setBookpartner(Long bookpartner) {
        this.bookpartner = bookpartner;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }
}