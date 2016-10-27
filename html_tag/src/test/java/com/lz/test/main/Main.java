package com.lz.test.main;

import com.lz.html.tag.select.Select;
import com.lz.html.tag.select.option.bean.Option;
import com.lz.html.tag.select.option.impl.OptionServiceImpl;

import java.util.*;

/**
 * ProjectName: HTML_Tag
 * PackageName: com.lz.html
 * Created by lizhe on 2016/10/26.
 */
public class Main {
    public static void main(String[] args) {

        List<Option> optionses = new ArrayList<>();
        Option option1 = new Option("lizhe", "lizhe");
        Option option2 = new Option("lizhe", "lizhe");
        Option option3 = new Option("lizhe", "lizhe");
        Option option4 = new Option("lizhe", "lizhe");
        Option option5 = new Option("lizhe", "lizhe");
        optionses.add(option1);
        optionses.add(option2);
        optionses.add(option3);
        optionses.add(option4);
        optionses.add(option5);
        System.out.println("数组大小-------------"+optionses.size());
        System.out.println("去重复==========================");
        Set<Option> set = new HashSet<>(optionses);
        optionses.clear();
        optionses.addAll(set);
        System.out.println("去重复后数组大小----------"+optionses.size());
        Option option = new Option("lizhe", "lizhe");
        System.out.println("Target:"+option);
        boolean contains = optionses.contains(option);
        System.out.println("是否包含---"+contains);
        optionses.remove(option);
        System.out.println("删除后数组大小-----------"+optionses.size());
        System.out.println(option1.equals(option2));
        System.out.println("======================================================");
        Map<String,String> data = new HashMap<>();
        data.put("1","1");
        data.put("2","2");
        data.put("3","3");
        data.put("4","4");
        OptionServiceImpl OptionService = new OptionServiceImpl(data,"lizhe");
        OptionService.insertOptionToFirstWithNotRepeat(new Option("3","3","lizhe"));
        Select select =new Select(OptionService);
        System.out.println(select.getSelectContent());
    }
}
