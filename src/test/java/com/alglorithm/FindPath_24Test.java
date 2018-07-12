package com.alglorithm;

import com.alglorithm.utils.RealExample;
import org.junit.Test;

import java.util.List;


/**
 * CreatedBy cx
 * CreateTime 2018/6/26 21:11
 * Description
 */
public class FindPath_24Test {

    @Test
    public void findPath() {
        RealExample r =new RealExample();
        System.out.println(r.getTreeNode());
        List list = new FindPath_24().FindPath(RealExample.treeNode,22);
        System.out.println(list);
    }
}