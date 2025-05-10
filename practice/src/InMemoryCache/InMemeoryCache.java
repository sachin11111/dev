package InMemoryCache;

import org.apache.commons.collections4.map.LRUMap;

public class InMemeoryCache<K,T> {

	private long timeToLive;
	private LRUMap map;
	
	public class cacheObject{
		public long accessedTime = System.currentTimeMillis();
		public T value; 

		public cacheObject(T value) {
			this.value = value;
		}
	}
	
	public InMemeoryCache(long timeToLive, long cleanupInterval, int maxSize) {
		this.timeToLive = timeToLive * 1000;
		map = new LRUMap(maxSize);
		
		if(timeToLive > 0  && cleanupInterval > 0) {
			Thread t = new Thread() {
				@Override
				public void run() {
					super.run();
					while(true) {
						try {
							Thread.sleep(cleanupInterval * 1000);
						} catch (InterruptedException e) {}
						cleanup();
					}
				}
			};
			t.start();
		}
	}
	
	
	public void put(K key, T value) {
		cacheObject object = new cacheObject(value);
		map.put(key, object);
	}

	@SuppressWarnings("unchecked")
	public T get(K key) {
		cacheObject object = (cacheObject) map.get(key);
		if(object==null) {
			return null;
		}else {
			object.accessedTime = System.currentTimeMillis();
			return object.value;
		}
	}	
	
	public void cleanup() {
		
	}
}

