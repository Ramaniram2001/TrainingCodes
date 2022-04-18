package com.training.ifaces;

public interface AgeCondition {
	default boolean Negate (Double age) {
		return age<50;
	}
}
