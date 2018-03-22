/**
 *
 * @author xekid78
 *
 */
public class Ary2d {

	public static void main(String[] args) {
		String[][] team = {{"佐藤","鈴木","田中"},{"岸田","有森","峯川"},{"武田","武藤","神田"}};

		System.out.println("*** パターン1 ***");
		for (int i = 0; i < team.length; i++) {
			for (int j = 0; j < team[i].length; j++) {
				System.out.print(team[i][j] + "さん  ");
			}
			System.out.println("");
			System.out.println("---");
		}

		System.out.println("");
		System.out.println("*** パターン２ ***");
		for (String[] tm : team) {
			for (String pr : tm) {
				System.out.print(pr + "くん  ");
			}
			System.out.println("");
			System.out.println("---");
		}

	}

}
