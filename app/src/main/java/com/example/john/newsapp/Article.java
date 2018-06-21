package com.example.john.newsapp;

public class Article {

    /**SectionName of the article */
    private String mSectionName;
    /**Title of the article */
    private String mWebTitle;
    /** Author name of the news*/
    private String newsAuthorName;
    /**Date of the article */
    private String mWebPublicationDate;
    /** Website URL of the article */
    private String mwebUrl;

    /**
     * Constructs a new {@link Article} object.
     * @param sectionName is the name of the article
     * @param webTitle is the title  of the article
     * @param authorFullName  is the news author full name
     * @param webPublicationDate is the time when the article was published
     * @param webUrl is the website URL to find more details about the article
     */
    public Article(String sectionName, String webTitle, String webPublicationDate,String authorFullName, String webUrl) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        newsAuthorName = authorFullName;
        mWebPublicationDate = webPublicationDate;
        mwebUrl = webUrl;
    }
    /**
     * Returns the section name of the article
     */
    public String getSectionName() { return mSectionName;}

    /**
     * Returns the author of the news.
     */
    public String getAuthorName() {
        return newsAuthorName;
    }

    /**
     * Returns the title of the article
     */
    public String getWebTitle() { return mWebTitle;}

    /**
     * Returns the date of the article
     */
    public String getwebPublicationDate () {return mWebPublicationDate;}/**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mwebUrl;
    }

}
