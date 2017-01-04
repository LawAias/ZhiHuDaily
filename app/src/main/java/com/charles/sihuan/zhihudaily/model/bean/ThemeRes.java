package com.charles.sihuan.zhihudaily.model.bean;

import java.util.List;

/**
 * Created by sihuan on 2017/1/3.
 * com.charles.sihuan.zhihudaily.model.bean
 */

public class ThemeRes {

    @Override
    public String toString() {
        return "ThemeRes{" +
                "limit=" + limit +
                ", subscribed=" + subscribed +
                ", others=" + others +
                '}';
    }

    /**
     * limit : 1000
     * subscribed : []
     * others : [{"color":15007,"thumbnail":"http://pic3.zhimg.com/0e71e90fd6be47630399d63c58beebfc.jpg","description":"了解自己和别人，了解彼此的欲望和局限。","id":13,"name":"日常心理学"}]
     */

    private int limit;
    private List<Theme> subscribed;
    private List<Theme> others;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<?> getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(List<Theme> subscribed) {
        this.subscribed = subscribed;
    }

    public List<Theme> getOthers() {
        return others;
    }

    public void setOthers(List<Theme> others) {
        this.others = others;
    }

    public static class Theme {
        @Override
        public String toString() {
            return "Theme{" +
                    "color=" + color +
                    ", thumbnail='" + thumbnail + '\'' +
                    ", description='" + description + '\'' +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        /**
         * color : 15007
         * thumbnail : http://pic3.zhimg.com/0e71e90fd6be47630399d63c58beebfc.jpg
         * description : 了解自己和别人，了解彼此的欲望和局限。
         * id : 13
         * name : 日常心理学
         */

        private int color;
        private String thumbnail;
        private String description;
        private int id;
        private String name;

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
