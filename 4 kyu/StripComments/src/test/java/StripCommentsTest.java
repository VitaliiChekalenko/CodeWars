import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StripCommentsTest {

	@Test
	public void stripComments() throws Exception {
		assertEquals(
				"apples, pears\ngrapes\nbananas",
				StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
		);

		assertEquals(
				"a\nc\nd",
				StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
		);
		assertEquals(
				"a\nc\nd",
				StripComments.stripComments( "f\n" +
						"\n" +
						"a\n" +
						"\n" +
						"-e\n" +
						"\n" +
						"--e\n" +
						"\n" +
						"b\n" +
						"\n" +
						"\n" +
						"-\n" +
						"cd\n" +
						"\n" +
						"b\n" +
						"\n" +
						"-\n" +
						"\n" +
						"be\n" +
						"\n" +
						"-\n" +
						"\n" +
						"-b\n" +
						"\n" +
						"d\n" +
						"\n" +
						"-\n" +
						"\n" +
						"de\n" +
						"\n" +
						"cba\n" +
						"\n" +
						"faa\n" +
						"\n" +
						"-f\n" +
						"\n" +
						"f\n" +
						"\n" +
						"-\n" +
						"\n" +
						"ff\n" +
						"\n" +
						"-\n" +
						"\n" +
						"df\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"fb\n" +
						"\n" +
						"d\n" +
						"\n" +
						"-f\n" +
						"efdeda\n" +
						"\n" +
						"dbf\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"-ec\n" +
						"\n" +
						"-caa-d\n" +
						"\n" +
						"ed\n" +
						"\n" +
						"-\n" +
						"\n" +
						"b\n" +
						"\n" +
						"a\n" +
						"\n" +
						"\n" +
						"aa\n" +
						"\n" +
						"acfa\n" +
						"\n" +
						"b\n" +
						"\n" +
						"aabf\n" +
						"\n" +
						"e\n" +
						"\n" +
						"a\n" +
						"\n" +
						"df\n" +
						"\n" +
						"e\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"b\n" +
						"\n" +
						"d\n" +
						"\n" +
						"ed\n" +
						"\n" +
						"\n" +
						"ae\n" +
						"\n" +
						"ee\n" +
						"\n" +
						"-bd\n" +
						"-\n" +
						"\n" +
						"\n" +
						"d\n" +
						"\n" +
						"c\n" +
						"\n" +
						"d\n" +
						"\n" +
						"bdf\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"f\n" +
						"\n" +
						"b\n" +
						"\n" +
						"\n" +
						"\n" +
						"a\n" +
						"\n" +
						"f\n" +
						"\n" +
						"-\n" +
						"\n" +
						"\n" +
						"\n" +
						"\n" +
						"a\n" +
						"\n" +
						"dd", new String[] { "#", "$" } )
		);

	}

}
