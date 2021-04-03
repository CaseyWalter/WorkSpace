package HW2;
public class CycloneTireTest {

	public static void main(String[] args) {
		CycloneTire c = new CycloneTire();
		c.runSimulation(1000);
		
		System.out.println("average promotion cost per tire: " + c.avg_promotion_cost);
		System.out.println("probability of refund >= $50:" + c.prob_refund_GE50);

	}

}
