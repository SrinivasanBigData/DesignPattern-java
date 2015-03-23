package com.srini.human;

public class HumanFactory {
	public static Human createHuman(String sex) {
		Human human = null;
		if ("male".equalsIgnoreCase(sex)) {
			human = new Boy();
		} else if ("girl".equalsIgnoreCase(sex)) {
			human = new Girl();
		}
		return human;
	}

}
