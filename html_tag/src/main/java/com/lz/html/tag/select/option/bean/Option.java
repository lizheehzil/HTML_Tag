package com.lz.html.tag.select.option.bean;

import org.apache.commons.lang3.StringUtils;

/**
 * ProjectName: HTML_Tag
 * PackageName: com.lz.html.select
 * Created by lizhe on 2016/10/26.
 */
public class Option{
    private String value;
    private String content;
    private String className;


    public Option(String value, String content) {
        this.value = value;
        this.content = content;
    }

    public Option(String value, String content, String className) {
        this.value = value;
        this.content = content;
        this.className = className;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isHasClass() {
        return StringUtils.isNotBlank(getClassName());
    }

    @Override
    public String toString() {
        StringBuilder content = new StringBuilder();
        content.append("<option");
        if(isHasClass()){
            content.append(" class=\"").append(className).append("\"");
        }
        content.append(" value=\"").append(value).append("\">").append(this.content).append("</option>\n");
        return content.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Option option = (Option) o;

        if (value != null ? !value.equals(option.value) : option.value != null) return false;
        return content != null ? content.equals(option.content) : option.content == null;

    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }




}
