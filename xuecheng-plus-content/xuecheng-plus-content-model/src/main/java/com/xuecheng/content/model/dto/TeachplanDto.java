package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@ToString
@Data
public class TeachplanDto extends Teachplan {
    //媒资管理信息
    private TeachplanMedia teachplanMedia;

    //小章节列表(子节点)
    private List<TeachplanDto> teachPlanTreeNodes;
}
