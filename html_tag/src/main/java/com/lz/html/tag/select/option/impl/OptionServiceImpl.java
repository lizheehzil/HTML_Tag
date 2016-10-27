package com.lz.html.tag.select.option.impl;

import com.lz.html.tag.select.option.bean.Option;

import java.util.*;

/**
 * ProjectName: HTML_Tag
 * PackageName: com.lz.html.tag.select.option.impl
 * Created by lizhe on 2016/10/27.
 */
public class OptionServiceImpl extends DefaultOptionService {
    public OptionServiceImpl(Map<String, String> data) {
        super(data);
    }

    public OptionServiceImpl(Map<String, String> data, String classname) {
        super(data, classname);
    }

    @Override
    public List<Option> getOptions() {

        return super.getOptions();
    }

    @Override
    public List<Option> insertOptionWithIndex(Option option, Integer index) {
        List<Option> options = this.getOptions();
        options.add(index, option);
        super.setOptions(options);
        return this.getOptions();
    }

    @Override
    public List<Option> insertOptionToFirst(Option option) {
        return insertOptionWithIndex(option, 0);
    }

    @Override
    public List<Option> insertOption(Option option) {
        List<Option> options = this.getOptions();
        options.add(option);
        super.setOptions(options);
        return this.getOptions();
    }

    @Override
    public List<Option> insertOptionToFirstWithNotRepeat(Option option) {
        List<Option> options = this.getOptions();
        //去重复
        Set<Option> set = new HashSet<>(options);
        options.clear();
        options.addAll(set);
        //判断是否包含元素
        if(options.contains(option)){
            options.remove(option);
            //去重复后排序
            options.sort((o1,o2)->{return o1.getContent().compareTo(o2.getContent());});
            //将option插入第一位
            options.add(0,option);
            super.setOptions(options);
            return this.getOptions();
        }else {
            options.add(0,option);
            super.setOptions(options);
            return this.getOptions();
        }
    }
}
