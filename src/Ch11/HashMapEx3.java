package Ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {

	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-1234-5678");
		addPhoneNo("친구", "김대리", "010-5121-5121");
		addPhoneNo("친구", "김대리", "010-6543-2152");
		addPhoneNo("친구", "박대리", "010-2152-3263");
		addPhoneNo("친구", "이과장", "010-1448-9574");
		addPhoneNo("세탁", "010-888-8888");

		printList();
	}

	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);
	}

	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}

	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();

			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();

			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}

}
