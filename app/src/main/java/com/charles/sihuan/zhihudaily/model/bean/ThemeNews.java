package com.charles.sihuan.zhihudaily.model.bean;

import java.util.List;

/**
 * Created by sihuan on 2017/1/6.
 * com.charles.sihuan.zhihudaily.model.bean
 */

public class ThemeNews {


    /**
     * date : 20170106
     * stories : [{"images":["http://pic2.zhimg.com/2bdef1a70a0ae549c5fe6c5ab4d957e9.jpg"],"type":0,"id":9124077,"ga_prefix":"010609","title":"接下来，让我们欢迎今天的 DJ\u2014\u2014统治棋坛的 AlphaGo"}]
     * top_stories : [{"image":"http://pic1.zhimg.com/b3a97c9c0142e62b8ffe351dae5f8894.jpg","type":0,"id":9125243,"ga_prefix":"010519","title":"趁着腊八，来说说粗杂粮应该怎么吃"}]
     */

    private String date;
    private List<Story> stories;
    private List<TopStory> top_stories;
    private String description;
    private String background;
    private String color;
    private String name;
    private String image;
    private String image_source;
    private List<Editor> editors;



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    public List<TopStory> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStory> top_stories) {
        this.top_stories = top_stories;
    }


    public static class Editor{
        /**
         * url : http://www.zhihu.com/people/wezeit
         * bio : 微在 Wezeit 主编
         * id : 70
         * avatar : http://pic4.zhimg.com/068311926_m.jpg
         * name : 益康糯米
         */

        private String url;
        private String bio;
        private int id;
        private String avatar;
        private String name;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public static class Story {
        /**
         * images : ["http://pic2.zhimg.com/2bdef1a70a0ae549c5fe6c5ab4d957e9.jpg"]
         * type : 0
         * id : 9124077
         * ga_prefix : 010609
         * title : 接下来，让我们欢迎今天的 DJ——统治棋坛的 AlphaGo
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStory {
        /**
         * image : http://pic1.zhimg.com/b3a97c9c0142e62b8ffe351dae5f8894.jpg
         * type : 0
         * id : 9125243
         * ga_prefix : 010519
         * title : 趁着腊八，来说说粗杂粮应该怎么吃
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }



}
