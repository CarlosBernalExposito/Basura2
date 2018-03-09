import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
class DomJudge17ATest {

	@Test
	void test() {
		Assert.assertEquals(2, DomJudge17A.contaPeces(1, 2));
		Assert.assertEquals(14, DomJudge17A.contaPeces(3, 3));
		Assert.assertEquals(1, DomJudge17A.contaPeces(1,1));
		Assert.assertEquals(55, DomJudge17A.contaPeces(5, 5));
	}

}
