package Chapter13;

public class Util {
	
	public static <P extends Pair<K, V>, K, V> V getValue(Pair<K,V> p, K k) {
		if(p.getKey().equals(k)) return p.getValue();
		return null;
	}
}
