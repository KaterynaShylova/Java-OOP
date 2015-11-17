/*Реализовать методы HashMap: keySet, entrySet, containsValue etc.
 */
package lesson10;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HomeTask6<K, V> {
	public static class Entry<K, V> {
		private K key;
		private V value;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}
	}

	private Object[] arr = new Object[16];

	public boolean containsValue(V value) {
		LinkedList<Entry<K, V>> list;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				list = (LinkedList<Entry<K, V>>) arr[i];

				for (int j = 0; j < list.size(); j++) {
					Entry<K, V> entry = list.get(j);
					if (entry.getValue().equals(value))
						return true;
				}
			}
		}
		return false;
	}

	public Set<K> keySet() {
		Set<K> set = new HashSet<K>();
		LinkedList<Entry<K, V>> list;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				list = (LinkedList<Entry<K, V>>) arr[i];

				for (int j = 0; j < list.size(); j++) {
					Entry<K, V> entry = list.get(j);
					set.add(entry.getKey());
				}
			}
		}
		return set;
	}

	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> set = new HashSet<Entry<K, V>>();
		LinkedList<Entry<K, V>> list;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				list = (LinkedList<Entry<K, V>>) arr[i];
				for (int j = 0; j < list.size(); j++)
					set.add(list.get(j));
			}
		}
		return set;
	}

	public void put(K key, V value) {
		Entry<K, V> e = new Entry<K, V>(key, value);

		int hashCode = key.hashCode();
		int n = Math.abs(hashCode % arr.length);

		if (arr[n] == null)
			arr[n] = new LinkedList<Entry<K, V>>();

		LinkedList<Entry<K, V>> list = (LinkedList<Entry<K, V>>) arr[n];

		for (int i = 0; i < list.size(); i++) {
			Entry<K, V> entry = list.get(i);
			if (entry.getKey().equals(e.getKey())) {
				entry.setValue(e.getValue());
				return;
			}
		}

		list.add(e);
	}
}
