package tests;

import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.Timeout;
import org.junit.runners.Parameterized.Parameters;
import src.Main;

class MainTest {
	
	@Parameters
	private static Stream<Arguments> addFixture() {
	    return Stream.of(
	      Arguments.of(20.0,20.0,1.0),
	      Arguments.of(4.0, 2.0,2.0),
	      Arguments.of(3.0, 4.0, 1.0));
	  }

	@ParameterizedTest
	@MethodSource("addFixture")
	@Timeout(value = 500, unit = java.util.concurrent.TimeUnit.MILLISECONDS)
	void test(Double first, Double second, double expValue) throws InterruptedException{
		assertEquals(expValue,Main.calculation(first,second));
	}
}
