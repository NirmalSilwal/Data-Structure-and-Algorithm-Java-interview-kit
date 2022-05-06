package LinkedList;

import java.util.LinkedList;

public class DesignBrowserHistory1472 {

	int currentPosition;
	LinkedList<String> list;

	public DesignBrowserHistory1472(String homepage) {
		list = new LinkedList<>();
		list.add(homepage);
		currentPosition = 0;
	}

	public void visit(String url) {
		// first clearing forward history
		for (int i = currentPosition + 1; i < list.size(); i++) {
			list.remove(i);
		}
		list.add(url);
		currentPosition++;
	}

	public String back(int steps) {
		while (steps != 0 && currentPosition > 0) {
			currentPosition--;
			steps--;
		}
		return list.get(currentPosition);
	}

	public String forward(int steps) {
		int count = 0;
		while (count != steps && currentPosition < list.size() - 1) {
			count++;
			currentPosition++;
		}

		return list.get(currentPosition);
	}
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * 
 * DesignBrowserHistory1472 obj = new DesignBrowserHistory1472(homepage);
 * 
 * obj.visit(url);
 * 
 * String param_2 = obj.back(steps);
 * 
 * String param_3 = obj.forward(steps);
 * 
 * Input:
 * 
 * ["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
 * 
 * [["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
 * 
 * Output:
 * 
 * [null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
 * 
 * Explanation:
 * 
 * BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
 * 
 * browserHistory.visit("google.com"); // You are in "leetcode.com". Visit
 * "google.com"
 * 
 * browserHistory.visit("facebook.com"); // You are in "google.com". Visit
 * "facebook.com"
 * 
 * browserHistory.visit("youtube.com"); // You are in "facebook.com". Visit
 * "youtube.com"
 * 
 * browserHistory.back(1); // You are in "youtube.com", move back to
 * "facebook.com" return "facebook.com"
 * 
 * browserHistory.back(1); // You are in "facebook.com", move back to
 * "google.com" return "google.com"
 * 
 * browserHistory.forward(1); // You are in "google.com", move forward to
 * "facebook.com" return "facebook.com"
 * 
 * browserHistory.visit("linkedin.com"); // You are in "facebook.com". Visit
 * "linkedin.com"
 * 
 * browserHistory.forward(2); // You are in "linkedin.com", you cannot move
 * forward any steps.
 * 
 * browserHistory.back(2); // You are in "linkedin.com", move back two steps to
 * "facebook.com" then to "google.com". return "google.com"
 * 
 * browserHistory.back(7); // You are in "google.com", you can move back only
 * one step to "leetcode.com". return "leetcode.com"
 * 
 */

/* failed test case - 

["BrowserHistory","visit","forward","forward","visit","visit","back","visit","visit","forward","back","visit","visit","visit","forward","forward","visit","visit","back","visit","forward","visit","visit","visit","back"]
[["jrbilt.com"],["uiza.com"],[3],[3],["fveyl.com"],["hyhqfqf.com"],[3],["cccs.com"],["bivz.com"],[6],[1],["cmbw.com"],["iywwwfn.com"],["sktbhdx.com"],[8],[10],["bskj.com"],["thw.com"],[6],["hgesj.com"],[6],["ctb.com"],["fllnc.com"],["fs.com"],[7]]


["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[5],[1],[1],["linkedin.com"],[2],[2],[7]]*/