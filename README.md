# Java2DArray
二次元配列

## 処理
二次元配列のデータをfor文と拡張for文のそれぞれで出力する。

## コード
```
public class sample16 {

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
```

## 出力結果  
```
*** パターン1 ***
佐藤さん  鈴木さん  田中さん  
---
岸田さん  有森さん  峯川さん  
---
武田さん  武藤さん  神田さん  
---

*** パターン２ ***
佐藤くん  鈴木くん  田中くん  
---
岸田くん  有森くん  峯川くん  
---
武田くん  武藤くん  神田くん  
---
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
