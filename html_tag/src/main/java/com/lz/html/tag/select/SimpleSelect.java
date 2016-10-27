package com.lz.html.tag.select;

import com.lz.html.tag.select.option.OptionService;
import com.lz.html.tag.select.option.bean.Option;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * ProjectName: HTML_Tag
 * PackageName: com.lz.html.tag.select
 * Created by lizhe on 2016/10/26.
 */
public abstract class SimpleSelect implements SelectI{

    SimpleSelect(OptionService optionService) {
        this.optionService = optionService;
        options = optionService.getOptions();
    }
    List<Option> options;
    OptionService optionService;


}
