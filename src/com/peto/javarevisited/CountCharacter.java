package com.peto.javarevisited;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class CountCharacter {

	public static void main(String[] args) {
		String base = "aghtyuymnabajhggjhjhjakljgo787ajkgmf  hfgjhgahjgamyua ghgfhfghajfl;ajlfjdlf;lsjoewijrnlvnlksdjldfl;sjd;ofxjlzlfj;lajl;jf;lja;ljdf;ljrieaLJ;lj;'zka;jlvzjv;ijljivjfnlkvn cjoisfnosdvojisel;oajLn ;OJOAJ;OJlJlJ;LJLJLjljalajljsdljfa;lj;lai l;k; aljaoidijo fldujroier lzjfojaiojaoidjf oadijroairjo;aizj vl;ajrlkjaf;ikmfh my name is minthunr jljmy namei is mithun roy my name is mitihun orjodfyou arjal JALJFDL;SAJFLSJDALFJSADLJFlajljdljflasdjfldsjfljsaf;ljasdlfjsadljflsadjfl;dsajf;lasdjf;lsjal;ajfl;jairjeojodfjaosifsd;lxjfvoaisdn awe9airuoajfoaj9iaojf09w4iorjfjoa f98ao 43jojaofjaojaojao f09a09ijo3noe ojao0 a0ojv oan0oa9oajofjnvao jaoaosjfosa9ifa ojv0a aojfpoajoajf0oa";
		long l1 = System.nanoTime();
		int count = countMatches(base, 'a');
		long l2 = System.nanoTime();

		System.out.println("time taken = " + (l2 - l1));
		System.out.println("Count = " + count);
	}

	public static int countMatches(final CharSequence str, final char ch) {
		// if (isEmpty(str)) {
		// return 0;
		// }
		int count = 0;
		// We could also call str.toCharArray() for faster look ups but that
		// would generate more garbage.
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	public static int countMatches1(String str, final char c) {
		int charCount = 0; // resetting character count
		for (char ch : str.toCharArray()) {
			if (ch == c) {
				charCount++;
			}
		}

		return charCount;
	}
}
