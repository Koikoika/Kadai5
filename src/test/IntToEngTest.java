package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import intToEng.IntToEng;

public class IntToEngTest {

	@Test
	public void intToEngに1を入力して正しく出力される() {
		IntToEng ite = new IntToEng();
		String expected = " one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	public void intToEngに21を入力して正しく出力される() {
		IntToEng ite = new IntToEng();
		String expected = " twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual,is(expected));
	}

}
