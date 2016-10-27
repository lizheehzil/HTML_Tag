package com.lz.html.tag.select;

import com.lz.html.tag.select.option.OptionService;
import com.lz.html.tag.select.option.bean.Option;

/**
 * ProjectName: HTML_Tag
 * PackageName: com.lz.html.tag.select
 * Created by lizhe on 2016/10/26.
 */
public class Select extends SimpleSelect {


    public Select(OptionService optionService) {
        super(optionService);
    }

    @Override
    public String getSelectContent() {

        if(options!=null&&!options.isEmpty()){
            StringBuilder content = new StringBuilder();
            for(Option o:options){
                content.append(o.toString());
            }
            return content.toString();
        }

        return null;
    }

    public void insertOption(String value,String content,String classname){
        options.add(new Option(value,content,classname));
    }
}
