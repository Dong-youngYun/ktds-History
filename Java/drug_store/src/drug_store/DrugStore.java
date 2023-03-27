package drug_store;

/**
 * 약국
 * 
 * @author User
 *
 */
public class DrugStore {
	/**
	 * 감기환자
	 */
	Customer cold = new Customer();
	/**
	 * 콧물환자
	 */
	Customer runnynose = new Customer();
	/**
	 * 근육통환자
	 */
	Customer musclePain = new Customer();

	/**
	 * 방문한다.
	 */
	public void visit() {
		cold.name = "윤동영";
		cold.symptom = "감기";

		runnynose.name = "홍길동";
		runnynose.symptom = "콧물";

		musclePain.name = "철수";
		musclePain.symptom = "근육통";

	}

	/**
	 * 처방한다
	 */
	public void prescribe() {
		/*
		 * 감기환자에게는 "이름"님, 감기증상 있으셔서 종합감기약 처방해 드립니다. 콧물환자에게는 "이름"님, 콧물증상 있으셔서 코막힘약 처방해
		 * 드립니다. 근육통환자에게는 "이름"님, 근육통증상 있으셔서 근육이완제 처방해 드립니다.
		 */
		// String name = "장민창";
		// name == "장민창"
		// if (name.equals("장민창")) {

		// }
		if (cold.symptom.equals("감기")) {
			System.out.println(cold.name + "님," + cold.symptom + "증상 있으셔서 종합감기약 처방해드립니다.");

		} else if (cold.symptom.equals("콧물")) {
			System.out.println(cold.name + "님," + cold.symptom + "증상 있으셔서 코막힘약 처방해 드립니다.");

		} else {
			System.out.println(cold.name + "님," + cold.symptom + "증상 있으셔서 근육이완제 처방해 드립니다.");
		}

		if (runnynose.symptom.equals("콧물")) {
			System.out.println(runnynose.name + "님," + runnynose.symptom + "증상 있으셔서 코막힘약 처방해드립니다.");

		} else if (runnynose.symptom.equals("콧물")) {
			System.out.println(runnynose.name + "님," + runnynose.symptom + "증상 있으셔서 종합감기약 처방해 드립니다.");

		} else {
			System.out.println(runnynose.name + "님," + runnynose.symptom + "증상 있으셔서 근육이완제 처방해 드립니다.");
		}

		if (musclePain.symptom.equals("근육통")) {
			System.out.println(musclePain.name + "님," + musclePain.symptom + "증상 있으셔서 근육이완제 처방해드립니다.");

		} else if (musclePain.symptom.equals("근육통")) {
			System.out.println(musclePain.name + "님," + musclePain.symptom + "증상 있으셔서 코막힘약 처방해 드립니다.");

		} else {
			System.out.println(musclePain.name + "님," + musclePain.symptom + "증상 있으셔서 종합감기약 처방해 드립니다.");
		}
	}
}
