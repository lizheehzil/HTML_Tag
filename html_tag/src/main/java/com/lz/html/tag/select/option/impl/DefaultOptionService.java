package com.lz.html.tag.select.option.impl;

import com.lz.html.tag.select.option.bean.Option;
import com.lz.html.tag.select.option.OptionService;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ProjectName: HTML_Tag
 * PackageName: com.lz.html.tag.select.option.impl
 * Created by lizhe on 2016/10/27.
 */
public abstract class DefaultOptionService implements OptionService {

    private Map<String, String> data;
    private String classname;
    private List<Option> options;

    DefaultOptionService(Map<String, String> data) {
        this.data = data;
        Options();
    }

    DefaultOptionService(Map<String, String> data, String classname) {
        this.data = data;
        this.classname = classname;
        Options();
    }


    private void Options() {
        if (data != null && !data.isEmpty()) {
            if (StringUtils.isNotBlank(classname)) {
                options = data.entrySet().stream().map(entry -> new Option(entry.getKey(), entry.getValue(), classname)).collect(Collectors.toList());
            } else {
                options = data.entrySet().stream().map(entry -> new Option(entry.getKey(), entry.getValue())).collect(Collectors.toList());
            }
        }
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
