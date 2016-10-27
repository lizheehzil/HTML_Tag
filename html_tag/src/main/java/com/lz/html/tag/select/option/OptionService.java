package com.lz.html.tag.select.option;

import com.lz.html.tag.select.option.bean.Option;

import java.util.List;

/**
 * ProjectName: HTML_Tag
 * PackageName: com.lz.html.tag.select.option
 * Created by lizhe on 2016/10/27.
 */
public interface OptionService {
    List<Option> getOptions();
    List<Option> insertOptionWithIndex(Option option,Integer index);
    List<Option> insertOptionToFirst(Option option);
    List<Option> insertOption(Option option);
    List<Option> insertOptionToFirstWithNotRepeat(Option option);
}
