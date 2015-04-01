package org.leeframe.engine;

import com.google.common.base.Joiner;

public class TestGuava {
    public static void main(String[] args) {
	String e = Joiner.on("：").join(1,2,3);
	System.out.println(e);
    }
}
